import java.util.Scanner;
import java.sql.*;

public class FavItem {

    public static void main(String args[]){

        String jdbcUrl = "jdbc:mysql://localhost:3306/lovedata";
        String dbUser = "root";
        String dbPassword = "database123";

        Scanner getInput = new Scanner(System.in);

        System.out.println("Write your fav food name;");
        String foodName = getInput.nextLine();
        System.out.println("How many roti you can eat?");
        int howMuch = getInput.nextInt();
        
        System.out.println(foodName + " -->" +howMuch);

        try(Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
        PreparedStatement preparedStatement = connection.prepareStatement(
            "INSERT INTO foodlovers(name, qty) VALUES (?, ?)")){
                preparedStatement.setString(1, foodName);
                preparedStatement.setInt(2, howMuch);

                int rowsAffected = preparedStatement.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println("User is foodie!");
                }else{
                    System.out.println("User is moodie!");
                }
            }catch(SQLException e){
                System.err.println("Database Error"+e.getMessage());
                e.printStackTrace();
            }finally{
                getInput.close();
            }

     
    }
    
}