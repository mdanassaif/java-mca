/*
exception handling in Java.  Exceptions are events that disrupt the normal flow of a program's execution.  Understanding how to handle them is crucial for writing robust and reliable code.

Why do we need Exception Handling?

Things can go wrong in your programs.  For example:

A file you're trying to read might not exist.
You might try to divide by zero.
A network connection might be lost.
If you don't handle these exceptions, your program will likely crash.  Exception handling provides a way to gracefully manage these situations and prevent your program from abruptly terminating.
 */

 /*
  FileReader class is used for reading character files, and IOException is a class that represents input/output exceptions (like a file not being found).
  */
  import java.io.FileReader;
  import java.io.IOException;
  
  public class Day20 {
      public static void main(String[] args) {
          try {
              FileReader reader = new FileReader("myfile.txt"); // Might throw IOException
              int character;
              while ((character = reader.read())!= -1) {
                  System.out.print((char) character);
              }
              reader.close(); // Important to close the file in a finally block
          } catch (IOException e) {
              System.out.println("Error reading file: " + e.getMessage());
          }
      }
  }