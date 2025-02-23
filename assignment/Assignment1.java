import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CalculateCGPA {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many subjects? ");
        int subjects = input.nextInt();
        
        double totalMarks = 0;
        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            totalMarks += input.nextDouble();
        }
        
        double percentage = totalMarks / subjects;
        double cgpa = percentage / 9.5;   
        
        System.out.println("Date: " + now.format(formatter)); 
        System.out.printf("\nYour Percentage: %.2f%%", percentage);
        System.out.printf("\nYour CGPA: %.2f", cgpa);
        
        input.close();
    }
}