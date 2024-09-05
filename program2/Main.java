package Task3.program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER EMPLOYEE DETAILS");
        System.out.print("Employee ID: ");
        int empId = sc.nextInt();
        System.out.print("Employee Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Yearly Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        System.out.println("Employee Information:");
        employee.displayEmployee();

        System.out.println("\nENTER PRODUCT DETAILS");
        System.out.print("Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(pid, price, quantity);
        System.out.println("Product Information:");
        product.displayProduct();
    }
}
