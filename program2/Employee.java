package Task3.program2;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private Double salary;

    // parameterized constructor
    public Employee(int empID, String name, Double salary) {
        this.empId = empID;
        this.name = name;
        this.salary = salary;
    }

    // Implementation of calcTax()
    @Override
    public double calcTax() {
        return salary * incomeTax;
    }

    // Method to display the details
    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Yearly Salary: " + salary);
        System.out.println("Income Tax: " + calcTax());
    }
}




