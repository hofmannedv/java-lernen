// ------------------------------------------------------------------
// Demonstrates different ways to output an array
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java ArrayPrint
// ------------------------------------------------------------------

// import required Java module
import java.util.Arrays;

public class ArrayPrint {
  public static void main (String[] args) {

    // single assignments
    int[] postcodeAlsace = new int[] {68000, 68130, 68100}; // array with 3 integer values

    // print content of postcodeAlsace using a foreach loop
    System.out.println("= Content of array postcodeAlsace (foreach loop) =");
    for (int value: postcodeAlsace) {
      System.out.println("postcode: " + value);
    }
    System.out.println(" ");

    // print content of postcodeAlsace using Arrays.toString method
    System.out.println("= Content of array postcodeAlsace (using conversion to String) =");
    System.out.println("postcode: " + Arrays.toString(postcodeAlsace));
    System.out.println(" ");

    // use StringBuilder class to concatenate the elements of an array
    System.out.println("= Content of array postcodeAlsace (using StringBuilder, and foreach loop) =");
    StringBuilder concatenatedString = new StringBuilder("postcode: ");
    for (int value: postcodeAlsace) {
      // convert integer to string
      String s = Integer.toString(value);
      // append string, and delimiter to a string
      concatenatedString.append(s).append(", ");
    }
    // remove the last two characters from the concatenated string
    System.out.println(concatenatedString.substring(0, concatenatedString.length() - 2));
  }
}
