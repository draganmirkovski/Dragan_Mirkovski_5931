import java.io.*;
import java.net.*;
import java.util.*;

public class VotingClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 9000;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println(in.readLine());
            System.out.print("Enter your vote: ");
            String vote = scanner.nextLine();
            out.println(vote);

            System.out.println("Server says: " + in.readLine());
        } catch (IOException e) {
            System.out.println("Error: Could not connect to server");
        }
    }
}