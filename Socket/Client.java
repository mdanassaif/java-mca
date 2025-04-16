import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 6666);
             DataOutputStream out = new DataOutputStream(s.getOutputStream());
             DataInputStream in = new DataInputStream(s.getInputStream())) {
            out.writeUTF("Hello Server!");
            System.out.println("Sent: Hello Server!");
            System.out.println("Server: " + in.readUTF());
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}