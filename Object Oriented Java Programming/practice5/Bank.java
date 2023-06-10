import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        if (!this.customers.contains(customer)) {
            this.customers.add(customer);
        }
    }
    public void addTransaction(Customer customer, double amount) {
        customer.addTransaction(amount);
        System.out.println("Transaction added for customer " + customer.getName() + ": " + amount);
    }
}
