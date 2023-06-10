import java.util.ArrayList;
public class Store {
    private ArrayList<ProductForSale> products = new ArrayList<ProductForSale>();
    private ArrayList<OrderItem> order = new ArrayList<OrderItem>();

    public static void main(String[] args) {
        Store store = new Store();

        ProductForSale book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99, "A classic novel about the American Dream.");
        ProductForSale clothing = new Clothing("T-Shirt", 19.99, "A comfortable and stylish t-shirt.", "M");

        store.addProduct(book);
        store.addProduct(clothing);

        OrderItem item1 = new OrderItem(2, book);
        OrderItem item2 = new OrderItem(3, clothing);

        store.addItem(item1);
        store.addItem(item2);

        store.printOrder();
    }

    public void addProduct(ProductForSale product) {
        products.add(product);
    }

    public void addItem(OrderItem item) {
        order.add(item);
    }

    public void printOrder() {
        double total = 0;
        System.out.println("Sales Receipt:");
        for (OrderItem item : order) {
            ProductForSale product = item.getProduct();
            int quantity = item.getQuantity();
            double price = product.getSalesPrice(quantity);;
            product.printPricedLineItem(quantity);
            product.showDetails();
            total += price;
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}
