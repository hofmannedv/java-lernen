// (C) 2025 Frank Hofmann, email info@efho.de
// Licensed under General Public License (GPL)

// demonstrates how to calculate the sales tax for a purchase
// usage: java SalesTax

public class SalesTax {
  public static void main (String[] args) {
    
    float taxRate = 0.2f;             // define a tax rate of 20% as float
    float price = 150.00f;            // define the net price as float
    float salesTax = taxRate * price; // calculate the sales tax as float
    float total = price + salesTax;   // calculate the total as float

    // output the result using printf for formatted numeric values
    System.out.printf("the tax for %.2f is %.2f which gives a total of %.2f \n", price, salesTax, total);
  }
}
