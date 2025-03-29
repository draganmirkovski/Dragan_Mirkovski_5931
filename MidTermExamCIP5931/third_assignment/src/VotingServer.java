import java.io.*;
import java.net.*;
import java.util.*;

public class VotingServer {
    private static final int PORT = 9000;
    private static final Map<String, Integer> votes = new HashMap<>();

    static {
        votes.put("Option A", 0);
        votes.put("Option B", 0);
        votes.put("Option C", 0);
    }

    public static void main(String[] args) {
        System.out.println("Voting Server started on port " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    System.out.println("Client connected: " + clientSocket.getInetAddress());
                    out.println("Available voting options: " + String.join(", ", votes.keySet()));

                    String vote = in.readLine();
                    if (votes.containsKey(vote)) {
                        votes.put(vote, votes.get(vote) + 1);
                        out.println("Vote cast successfully for " + vote);
                    } else {
                        out.println("Invalid option");
                    }

                    System.out.println("Current votes: " + votes);
                } catch (IOException e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Server failed to start: " + e.getMessage());
        }
    }
}

