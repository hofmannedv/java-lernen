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

public class Typecasting {
  public static void main (String[] args) {

    // variable assignments
    boolean isAvailable = true;        // boolean assignment with value 'true'
    byte amount = 5;                   // byte assignment with value '5' 
    short width = -45;                 // short assignment with value '-45' 
    char letter = '%';                 // character assignment with value '%'
    int postcode = 14467;              // integer assignment with value '14467' 
    long height = 135792468;           // long assignment with value '135792468' 
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
    System.out.println("float as long from " + weight + " to " + (long)weight);
    System.out.println("long as int from " + height + " to " + (int)height); // ?
    System.out.println("short as byte from " + width + " to " + (byte)width);

    // assigning values using an implicit data type conversion
    // * float to int
    float length1 = 1.55f;             // float assignment with value 1.55
    int adjustedLength1 = (int)length1;// integer conversion, and assignment of 1
    System.out.printf("float of %f converted to int of %d \n", length1, adjustedLength1);

    // * float to int
    float length2 = 1.45f;             // float assignment with value 1.45
    int adjustedLength2 = (int)length2;// integer conversion, and assignment of 1
    System.out.printf("float of %f converted to int of %d \n", length1, adjustedLength1);

    // * double to String using the Double class
    double netPriceD = 12.34d;         // double assignment with value 12.34
    String netPriceS = Double.toString(netPriceD); // convert to string
    System.out.printf("double of %f converted to string of %s using Double class \n", netPriceD, netPriceS);

    // * double to String using valueOf method
    // double netPriceD = 12.34d;         // double assignment with value 12.34
    netPriceS = String.valueOf(netPriceD);         // convert to string
    System.out.printf("double of %f converted to string of %s using valueOf method \n", netPriceD, netPriceS);
  }
}
