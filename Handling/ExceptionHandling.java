import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Divide by zero (Unchecked: ArithmeticException)
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero: " + e.getMessage());
        }

        // Read file (Checked: IOException)
        try {
            readFile("file.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    private static void readFile(String file) throws IOException {
        throw new IOException("File not found");
    }
}