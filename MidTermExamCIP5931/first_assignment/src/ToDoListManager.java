import java.io.*;
import java.util.Scanner;

public class ToDoListManager {
    private static final String FILE_NAME = "todo.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim();

            if (command.startsWith("add ")) {

                String task = command.substring(4);
                addTask(task);
            } else if (command.equals("view")) {
                viewTasks();
            } else if (command.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command. Please use 'add <task>', 'view', or 'exit'.");
            }
        }

        scanner.close();
    }

    private static void addTask(String task) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(task);
            bufferedWriter.newLine();
            System.out.println("Task added");
        } catch (IOException e) {
            System.out.println("Error: Cannot write to file");
        }
    }

    private static void viewTasks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No tasks in the list");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int taskNumber = 1;
            boolean hasTasks = false;

            while ((line = reader.readLine()) != null) {
                System.out.println(taskNumber + ". " + line);
                taskNumber++;
                hasTasks = true;
            }

            if (!hasTasks) {
                System.out.println("No tasks in the list");
            }
        } catch (IOException e) {
            System.out.println("Error: Cannot read from file");
        }
    }
}
