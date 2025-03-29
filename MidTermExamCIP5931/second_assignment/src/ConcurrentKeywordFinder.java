import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.time.LocalDateTime;

public class ConcurrentKeywordFinder {
    static final List<String> foundFiles = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ConcurrentKeywordFinder <keyword> <file1> <file2> ... <fileN>");
            return;
        }

        String keyword = args[0].toLowerCase();
        List<String> files = Arrays.asList(Arrays.copyOfRange(args, 1, args.length));

        ExecutorService executor = Executors.newFixedThreadPool(Math.min(files.size(), 10));

        for (String file : files) {
            executor.submit(new KeywordFinderTask(file, keyword));
        }

        executor.shutdown();
        try {
            awaitTermination(executor, 60);
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        if (foundFiles.isEmpty()) {
            System.out.println("Keyword not found in any of the specified files.");
        } else {
            System.out.println("Keyword found in:");
            for (String file : foundFiles) {
                System.out.println(file);
            }
        }
    }

    private static void awaitTermination(ExecutorService executor, long timeoutInSeconds) throws InterruptedException {
        LocalDateTime endTime = LocalDateTime.now().plusSeconds(timeoutInSeconds);
        while (!executor.isTerminated()) {
            if (LocalDateTime.now().isAfter(endTime)) {
                executor.shutdownNow();
                System.out.println("Timeout reached. Shutting down the executor.");
                return;
            }
            Thread.sleep(100);
        }
    }
}
