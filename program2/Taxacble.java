package Task3.program2;

interface Taxable{
    // variables containing the values of sales tax and income tax
    double incomeTax = 0.105;
    double salesTax = 0.07;

    // Abstract method to calculate tax
    double calcTax();

}