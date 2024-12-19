class SFBook extends Book {
    private int publishYear;
    private boolean bestSeller;

    public SFBook(String title, String author, double price, String language, int publishYear, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.bestSeller = bestSeller;
    }

    @Override
    public void printAttributes() {
        System.out.println("SF Book info: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + getLanguage());
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Best Seller: " + bestSeller);
    }

    @Override
    public int getPublishYear() {
        return publishYear;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }
}