import java.io.*;
import java.net.*;

public class Task20_Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5050);
            System.out.println("Connected to server! Start chatting (type 'exit' to quit):");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String serverMsg, clientMsg;
            while (true) {
                // Send client message
                System.out.print("You: ");
                clientMsg = userInput.readLine();
                out.println(clientMsg);
                if (clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Disconnecting...");
                    break;
                }

                // Read server response
                serverMsg = in.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + serverMsg);
            }

            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}