import java.sql.*;

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
            Statement stateM = con.createStatement();

            String stateM_one = "INSERT INTO emp_data VALUES (400, 'Queen', 600000);";
            try {
                stateM.executeUpdate(stateM_one);
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                System.out.println("Data already exists in the database.");
            }

            String getData = "SELECT * FROM emp_data;";
            ResultSet rs = stateM.executeQuery(getData); 

            while (rs.next()) {
                Emp_ID = rs.getInt("Emp_ID");
                Name = rs.getString("Name");
                Salary = rs.getInt("Salary");

                System.out.println("ID: " + Emp_ID + ", Name: " + Name + ", Salary: " + Salary);
            }

            rs.close();
            stateM.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Database not connected properly.");
        }
    }
}