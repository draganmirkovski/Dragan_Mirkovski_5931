
class EBook extends Book{
    private double fileSize;

    public EBook(String title, String author, double fileSize){
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }
}


class PrintedBook extends Book{
    private int numberOfPages;

    public PrintedBook(String title, String author, int numberOfPages){
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}