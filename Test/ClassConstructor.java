// ClassConstructor.java

public class ClassConstructor {
    int number = 101;
    String Name = "Azhar";

    ClassConstructor(int number , String Name) {
        // System.out.println("From Default Constructor!");
        this.number = number;
        this.Name = Name;
        System.out.println("From Parameterized Constructor!");
        
    }

    public static void main(String[] args) {
        ClassConstructor new1 = new ClassConstructor(23,"Khan Sahab");
        // ClassConstructor new1 = new ClassConstructor();
        System.out.println(new1.number);
        System.out.println(new1.Name);
    }
}


