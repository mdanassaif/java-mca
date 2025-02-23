 
public class Day08 { // Outer class: Contains the main method and other classes

    public static class Users { // Inner class (static): Represents a user

        String name; // Instance variable: Stores the user's name
        int age;    // Instance variable: Stores the user's age
        String role;  // Instance variable: Stores the user's role

        // Constructor: Initializes a new Users object
        public Users(String name, int age, String role) {
            this.name = name; // Assign the passed name to the instance variable name
            this.age = age;   // Assign the passed age to the instance variable age
            this.role = role; // Assign the passed role to the instance variable role
        }

        // Method: Simulates a user waking up
        public void wakeUp() {
            System.out.println("Good morning!");
        }

        // Method: Simulates a user going to sleep
        public void sleepTime() {
            System.out.println("Good Night");
        }
    } // End of Users inner class

    public static void main(String[] args) { // Main method: Entry point of the program

        // Create two Users objects using the constructor
        Users firstUser = new Users("Anas", 21, "Web Developer");
        Users secondUser = new Users("Gee Wally", 19, "Data Scientist.");

        // Call the wakeUp method of the firstUser object
        firstUser.wakeUp();

        // Print information about the first user, accessing their attributes
        System.out.println("Our Company's first User is " + firstUser.name + 
                           " And he is " + firstUser.age + 
                           " years old and working on role:" + firstUser.role);

        System.out.println("-------------------------"); // Separator

        // Print information about the second user, accessing their attributes
        System.out.println("Our Company's second User is " + secondUser.name + 
                           " And he is " + secondUser.age + 
                           " years old and working on role:" + secondUser.role);

        // Call the sleepTime method of the secondUser object
        secondUser.sleepTime();

    } // End of main method
} // End of Day08 outer class