public class Clothing extends ProductForSale {
    private String size;

    public Clothing(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.printf("Size: %s\nPrice: $%.2f\nDescription: %s\n", size, getPrice(), getDescription());
    }
}