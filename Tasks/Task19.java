import java.sql.*;


public class Task19{
    public static void main(String[] args){
        try{
            String id = NULL, name = NULL, course = NULL;

            class.forName("com.mysql.jdbc.Driver");


            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "password");

            Statement stm = conn.createStatement();

            String str2 = "insert into st_tab values('12', 'anas', 'mohd')";
            
            stm.executeUpdate(str2);


            String str1 = "select * from st_tab";

            ResultSet rs = stm.exeuteQuery(str1);

            while(rs.next()){
                id = getString("Rool no");
                name = getString("S_NBame");
                course = getString("Course");


            }

            conn.close();
        }catch(Exception e){
            System.out.println("Database not connected");
        }
    }
}