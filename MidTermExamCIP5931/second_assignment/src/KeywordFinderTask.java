import java.io.*;
import java.util.*;
import java.util.concurrent.*;
class KeywordFinderTask implements Runnable {
    private final String filename;
    private final String keyword;

    public KeywordFinderTask(String filename, String keyword) {
        this.filename = filename;
        this.keyword = keyword.toLowerCase();
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                ConcurrentKeywordFinder.foundFiles.add(filename);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Warning: File not found - " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }
    }
}