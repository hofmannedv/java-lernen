// ------------------------------------------------------------------
// Demonstrates how to assign values to an array 
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java AssignmentsArray
// ------------------------------------------------------------------

public class AssignmentsArray {
  public static void main (String[] args) {

    // single assignments
    boolean[] isChecked;               // array of boolean assignment without value
    int[] postcode = new int[5];       // array of 5 integer elements, value: 0
    int[] postcodeAlsace = new int[] {68000, 68130, 68100}; // array with 3 integer values

    // cannot be printed: array isChecked is not initialized
    // System.out.println("isChecked: " + isChecked);

    // print memory addresses of postcode, and postcodeAlsace
    System.out.println("postcode: " + postcode);
    System.out.println("postcodeAlsace: " + postcodeAlsace);
    System.out.println(" ");

    // print content of postcode using a foreach loop
    System.out.println("= Content of array postcode =");
    for (int value: postcode) {
      System.out.println("postcode: " + value);
    }
    System.out.println(" ");

    // print content of postcodeAlsace using a foreach loop
    System.out.println("= Content of array postcodeAlsace =");
    for (int value: postcodeAlsace) {
      System.out.println("postcode: " + value);
    }

  }
}
