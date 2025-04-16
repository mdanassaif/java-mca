import java.sql.*;
import java.util.Scanner;

public class JDBCINCLASS {
    public static void main(String[] args) {
        try {
            int Emp_ID = 0, Salary = 0;
            String Name = null;  

            String jdbcURL = "jdbc:mysql://localhost:3306/lab";
            String dbUser = "root";
            String dbPassword = "database123";

            Class.forName("com.mysql.cj.jdbc.Driver");  

            Connection con = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            con.setAutoCommit(false); 
            
            // user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            Emp_ID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            Name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            Salary = scanner.nextInt();
            
            // PreparedStatement
            String insertSQL = "INSERT INTO Emp_info VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            pstmt.setInt(1, Emp_ID);
            pstmt.setString(2, Name);
            pstmt.setInt(3, Salary);
            try {
                pstmt.executeUpdate();
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                System.out.println("Data already exists in the database.");
            }
            
            con.commit();  
            
  
            String getData = "SELECT * FROM Emp_info";
            Statement stateM = con.createStatement();
            ResultSet rs = stateM.executeQuery(getData); 

            while (rs.next()) {
                Emp_ID = rs.getInt("Emp_ID");
                Name = rs.getString("Name");
                Salary = rs.getInt("Salary");

                System.out.println("ID: " + Emp_ID + ", Name: " + Name + ", Salary: " + Salary);
            }

            rs.close();
            stateM.close();
            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Database not connected properly.");
            e.printStackTrace();
        }
    }
}