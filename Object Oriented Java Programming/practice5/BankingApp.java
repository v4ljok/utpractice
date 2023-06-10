public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        Customer alice = new Customer("Alice");
        Customer tom = new Customer("Tom");
        bank.addCustomer(alice);

        bank.addTransaction(alice, 100.0);
        bank.addTransaction(alice, -50.0);

        bank.addTransaction(tom, -100.0);
        bank.addTransaction(tom, 50.0);

        for (double amount : alice.getTransactions())
            System.out.println(amount);

        for (double amount : alice.getTransactions())
            System.out.println(amount);
    }
}
