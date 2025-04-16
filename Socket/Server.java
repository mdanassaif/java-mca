import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(6666)) {
            System.out.println("Server started on port 6666...");
            try (Socket s = ss.accept();
                 DataInputStream in = new DataInputStream(s.getInputStream());
                 DataOutputStream out = new DataOutputStream(s.getOutputStream())) {
                String msg = in.readUTF();
                System.out.println("Client: " + msg);
                out.writeUTF("Got: " + msg);
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}