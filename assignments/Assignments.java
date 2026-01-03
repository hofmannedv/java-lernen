// ------------------------------------------------------------------
// demonstrates how to assign values to a variable
//
// (C) 2025-2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java Assignments
// ------------------------------------------------------------------

public class Assignments {
  public static void main (String[] args) {

    // single assignments
    boolean isChecked;                 // boolean assignment without value
    boolean isAvailable = true;        // boolean assignment with value 'true'
    int postcode = 14467;              // integer assignment with value '14467' 
    char letter = '%';                 // character assignment with value '%'
    String colour = "blue";            // string assignment with value 'blue'

    // cannot be printed: variable isChecked is not initialized
    // System.out.printf("isChecked: %b", isChecked);

    System.out.printf("isAvailable: %b\n", isAvailable);
    System.out.printf("postcode: %d\n", postcode);    // use %d as placeholder for int
    System.out.printf("letter: %c\n", letter);
    System.out.printf("colour: " + colour + "\n");

    // multiple assignments
    boolean isIncluded, isClosed;      // boolean assignments without value
    int a, b, c;                       // define a, b, and c as integers without value
    a = b = c = 1;                     // assign 1 to a, b, and c
    int d = 3, e = 4;                  // assign 3 to d, and 4 to e

    // cannot be printed: variable isIncluded, and isClosed are not initialized
    // System.out.printf("isIncluded: %b", isIncluded);

    System.out.printf("a, b, c, d, e: %d %d %d %d %d\n", a, b, c, d, e);

    // assignments with calculations, and datatype conversions
    int total = a + b - c + d - e;     // simple addition of five values
    String output2 = "light" + colour; // concatenate two strings
    String output3 = colour + Integer.toString(total); // concatenate a string with converted integer
    String output4 = colour + String.valueOf(total);   // concatenate a string with converted integer
    String output5 = colour + total;   // concatenate a string with automatic conversion

    System.out.printf("total: %d\n", total);
    System.out.printf("output2: " + output2 + "\n");
    System.out.printf("output3: " + output3 + "\n");
    System.out.printf("output4: " + output4 + "\n");
    System.out.printf("output5: " + output5 + "\n");

    // combined assignments
    total += 1;                        // short for total = total + 1
    total -= 1;                        // short for total = total - 1
    total *= 2;                        // short for total = total * 2
    total /= 2;                        // short for total = total / 2
    total %= 5;                        // short for total = total % 5

    // print a partial string from the beginning up to index position 2 ('bl')
    System.out.println(colour.substring(0, 2));

    // print a partial string, the last three letters ('lue')
    System.out.println(colour.substring(colour.length() - 3, colour.length()));

    // print a partial string from index position 2 up to the end ('ue')
    System.out.println(colour.substring(2, colour.length()));
  }
}
