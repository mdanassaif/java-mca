import java.sql.*;
import java.util.Scanner;

 class BankingSystem {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bankdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "database123";
    private static Scanner scanner = new Scanner(System.in);

    


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Register New Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void registerAccount() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = scanner.nextDouble();

            String sql = "INSERT INTO accounts (username, password, balance) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, username);
                ps.setString(2, password); // In production, hash this!
                ps.setDouble(3, initialDeposit);
                
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Account created successfully!");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void login() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            String sql = "SELECT * FROM accounts WHERE username = ? AND password = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, username);
                ps.setString(2, password);
                
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    bankingMenu(rs.getInt("id"), rs.getDouble("balance"), conn);
                } else {
                    System.out.println("Invalid credentials!");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void bankingMenu(int accountId, double balance, Connection conn) {
        while (true) {
            System.out.println("\n=== Banking Menu ===");
            System.out.println("Current Balance: $" + balance);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            
            try {
                switch (choice) {
                    case 1: // Deposit
                        System.out.print("Enter deposit amount: ");
                        double deposit = scanner.nextDouble();
                        if (deposit > 0) {
                            balance = updateBalance(conn, accountId, balance + deposit);
                            System.out.println("Deposit successful!");
                        }
                        break;
                    case 2: // Withdraw
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = scanner.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance = updateBalance(conn, accountId, balance - withdraw);
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Insufficient funds!");
                        }
                        break;
                    case 3: // Check Balance
                        System.out.println("Current Balance: $" + balance);
                        break;
                    case 4: // Logout
                        System.out.println("Logged out successfully!");
                        return;
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static double updateBalance(Connection conn, int accountId, double newBalance) 
            throws SQLException {
        String sql = "UPDATE accounts SET balance = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newBalance);
            ps.setInt(2, accountId);
            ps.executeUpdate();
            return newBalance;
        }
    }
}