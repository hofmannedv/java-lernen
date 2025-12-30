// ------------------------------------------------------------------
// demonstrates how to calculate the sales tax for a purchase
//
// (C) 2025 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java SalesTax
// ------------------------------------------------------------------


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
