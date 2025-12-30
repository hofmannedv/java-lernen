// ------------------------------------------------------------------
// demonstrates how to assign values to a variable
//
// (C) 2025 Frank Hofmann
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
    

    // assignments with calculations

    // print a partial string from index position 2 up to, but not including 4

    // print a partial string, the last four letters

    // print a partial string from index position 2 up to the end

    // System.out.println("Hello, world!");
  }
}
