import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class PJDBC {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/my_jdbc_db";
        String username = "root";
        String password = "database123";

        Scanner getInput = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully!");

            try (Connection myConnection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connected to the database!");

                // Part 1: Insert data
                System.out.println("ENTER DETAILS TO ADD NEW USERS");
                System.out.print("ID (number): ");
                int id = Integer.parseInt(getInput.nextLine());
                System.out.print("Name: ");
                String name = getInput.nextLine();
                System.out.print("Role: ");
                String role = getInput.nextLine();

                String insertQuery = "INSERT INTO students (id, name, role) VALUES (?, ?, ?)";
                PreparedStatement insertStmt = myConnection.prepareStatement(insertQuery);
                insertStmt.setInt(1, id);
                insertStmt.setString(2, name);
                insertStmt.setString(3, role);
                int rowsAffected = insertStmt.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted successfully!");

                // Part 2: Retrieve all data
                Statement myStatements = myConnection.createStatement();
                String selectQuery = "SELECT * FROM students";
                ResultSet myResultSet = myStatements.executeQuery(selectQuery);
                System.out.println("Query executed! Displaying all students:");

                boolean hasResults = false;
                while (myResultSet.next()) {
                    int retrievedId = myResultSet.getInt("id");
                    String retrievedName = myResultSet.getString("name");
                    String retrievedRole = myResultSet.getString("role");
                    System.out.println("ID: " + retrievedId + " Name -> " + retrievedName + " Got role of " + retrievedRole);
                    hasResults = true;
                }

                if (!hasResults) {
                    System.out.println("No records found in the students table.");
                }

            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
        } finally {
            getInput.close();
        }
    }
}