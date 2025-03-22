import java.util.Scanner;
import java.sql.*;

public class Task19 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/task19db";
        String dbUser = "root";
        String dbPassword = "database123";

        Scanner getInput = new Scanner(System.in);

        System.out.println("Fav food name:");
        String foodName = getInput.nextLine();
        System.out.println("How many rotis?");
        int howMuch = getInput.nextInt();

        System.out.println(foodName + " --> " + howMuch);

        try (Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO foodlovers(name, qty) VALUES (?, ?)")) {
            stmt.setString(1, foodName);
            stmt.setInt(2, howMuch);
            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "User is foodie!" : "User is moodie!");
        } catch (SQLException e) {
            System.err.println("DB Error: " + e.getMessage());
        } finally {
            getInput.close();
        }
    }
}