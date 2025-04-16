import java.sql.*;

public class JDBCOne {
    public static void main(String args[]) {
        try {
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_jdbc_db", "root", "database123");

            Statement stm = conn.createStatement();
            String str2 = "insert into student_table values('12','Mohd Khan','BSc');";
            stm.executeUpdate(str2);

            str2 = "insert into student_table values('13','Twitter Musk','PhD');";
            stm.executeUpdate(str2);

            String str1 = "select * from student_table;";
            ResultSet rs = stm.executeQuery(str1);

            while (rs.next()) {
                String id = rs.getString("Roll_no");
                String name = rs.getString("S_name");
                String course = rs.getString("S_course");
                System.out.println(id + "\t" + name + "\t" + course);
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Database Not Connected: " + e.getMessage());
        }
    }
}