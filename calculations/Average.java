// ------------------------------------------------------------------
// Demonstrates the calculation of the average of a number of values
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Average
// ------------------------------------------------------------------

public class Average {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 23, 4, 15, 20};

    int total = 0;
    int length = data.length; // determine the number of items in data

    // calculate the total of data
    for (int value: data) {
      total += value;
    }

    float average = (float) total / length;

    // output the average value with two decimal places
    System.out.printf("The average value is: %.2f\n", average);

  }
}
