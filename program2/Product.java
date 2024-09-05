package Task3.program2;

public class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementation of calcTax()
    @Override
    public double calcTax() {
        return salesTax * price;
    }

    // Method to display the details
    public void displayProduct() {
        System.out.println("Product ID: " + pid);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax on Unit Price: " + calcTax());
    }
}
