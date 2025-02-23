public class Constructor{
    int Age;
    String Name;


    // Default constructor
    public Constructor(){
        Age = 20;
        Name = "Anas";
    }

    // Parameterized constructor
    public Constructor(int Age, String Name){

        this.Age = Age;
        this.Name = Name;
    }

    // Method to print the user details

    public void PrintDetails(){
        System.out.println("Age: "+Age);
        System.out.println("Name"+Name);
    }

    public static void main(String[] args){
        // Creating a car object using the default constructor
        Constructor Cons1 = new Constructor();
        Cons1.PrintDetails();

        // Creating a car object using the Parameterized constructor
        Constructor Cons2 = new Constructor(122, "Mohd");
        Cons2.PrintDetails();
    }



}

// rules to creating constructor
// 1. The name of the constructor must be same as the class Name
// 2. Constructor does not have return type.