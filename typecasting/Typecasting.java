// ------------------------------------------------------------------
// demonstrates how to cast between variable types
//
// (C) 2025 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java Typecasting
//
// used resources for the content: 
// * Java Type Casting, from w3schools
//   see https://www.w3schools.com/java/java_type_casting.asp
// * Java Output printf() Method, from w3schools
//   see https://www.w3schools.com/java/ref_output_printf.asp
// ------------------------------------------------------------------

// *** still incomplete, and file is work in progress ***

public class Typecasting {
  public static void main (String[] args) {

    // variable assignments
    boolean isAvailable = true;        // boolean assignment with value 'true'
    byte amount = 5;                   // byte assignment with value '5' 
    short width = -45;                 // short assignment with value '-45' 
    char letter = '%';                 // character assignment with value '%'
    int postcode = 14467;              // integer assignment with value '14467' 
    long height = 135792;              // long assignment with value '135792' 
    float weight = 1.25f;              // float assignment with value 1.25
    double size = 2.25;                // double assignment with value 2.25
    String colour = "blue";            // string assignment with value 'blue'

    // converting a smaller type to a larger type size (automated conversion)
    // * boolean -> byte -> short -> char -> int -> long -> float -> double
    // * char -> String
    System.out.printf("boolean (lowercase): %b \n", isAvailable);
    System.out.printf("boolean (uppercase): %B \n", isAvailable);
    System.out.println("boolean (implicit):  " + isAvailable);

    // converting a larger type to a smaller type size (manual conversion)
    // * double -> float -> long -> int -> char -> short -> byte -> boolean 
    // * String -> char

  }
}
