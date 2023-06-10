public class Book extends ProductForSale {
    private String author;

    public Book(String title, String author, double price, String description) {
        super(title, price, description);
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.printf("by %s\nPrice: $%.2f\nDescription: %s\n", author, getPrice(), getDescription());
    }
}