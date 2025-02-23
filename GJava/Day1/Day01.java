 
public class Day01{

    public static void main(String[] args) {
        System.out.println("Hello, Java Boi!"); 
    }
}

// public : This is an access modifier. Means this class can be accessed from any other part of your program 

// class : This keyword is used to declare a class.

// HelloWorld : This is the name of the class.

// static : This means that the main method belongs to the HelloWorld class itself, rather than to a specific instance of the HelloWorld class

// void : This indicate that the "main" method doesn't return any value. When the main method finishes executing, it doesn't give back any specific result.

// main : This is the name of the method. A special method in Java. Entry point of your program when you run the program so Java Virtual Machine looks for this "main" method to start exectution.

// (String[] args) : These are the parameters of the main method. String[] means an array of Strings. args is the name of the array. This array can be used to pass command-line-aerguments to your program.

/* Eg : if you run your program like java HelloWorld arg1 arg2, then args[0] would be "arg1" and args[1] would be "arg2". We won't use command-line arguments in this simple example, but it's important to understand what args represents. */

// System.out : This represents the standdard output stream. It's an object that's used to print data to the console.

// println() : This is a method of the System.out object. "println()" stands for `print line`. It prints the string that you give it as an argument, followed by a newline charcater(so the next thing you print will appear on the next line.)

// "Hello, Wordl!" : This is a string literal. It's the text that we want to print to the console.


// Keep in mind, Java is just coding not stone. So be ready to break java without Hammer.