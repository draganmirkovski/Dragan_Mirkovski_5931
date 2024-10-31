class Media {
    protected String title;
    protected String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
    }
}

class Book extends Media {
    private int numPages;

    public Book(String title, String creator, int numPages) {
        super(title, creator);
        this.numPages = numPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numPages);
    }

    public void readSample() {
        System.out.println("Sample pages are available to read.");
    }
}

class Movie extends Media {
    private double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
    }

    public void watchTrailer() {
        System.out.println("A trailer is available to watch.");
    }
}

class Library {
    public static void displayAllMedia(Media[] mediaArray) {
        for (Media media : mediaArray) {
            media.displayInfo();
            if (media instanceof Book) {
                ((Book) media).readSample();
            } else if (media instanceof Movie) {
                ((Movie) media).watchTrailer();
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Media[] mediaArray = {
                new Book("1984", "George Orwell", 328),
                new Movie("Inception", "Christopher Nolan", 148.5)
        };

        Library.displayAllMedia(mediaArray);
    }
}