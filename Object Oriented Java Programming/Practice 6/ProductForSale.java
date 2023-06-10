public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public abstract void showDetails();

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("%s (%d) - $%.2f\n", getType(), quantity, getSalesPrice(quantity));
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}