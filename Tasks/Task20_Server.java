import java.io.*;
import java.net.*;

public class Task20_Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5050);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected! Start chatting (type 'exit' to quit):");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMsg, serverMsg;
            while (true) {
                // Read client message
                clientMsg = in.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + clientMsg);

                // Send server response
                System.out.print("You: ");
                serverMsg = userInput.readLine();
                out.println(serverMsg);
                if (serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Server shutting down.");
                    break;
                }
            }

            in.close();
            out.close();
            userInput.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}