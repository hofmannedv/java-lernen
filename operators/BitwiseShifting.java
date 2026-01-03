// ------------------------------------------------------------------
// Demonstrates usage of bitwise shifting
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BitwiseShifting
//
// Further reading:
// * Java Bitwise Operators
//   https://www.baeldung.com/java-bitwise-operators
// ------------------------------------------------------------------

// import required modules
import java.io.*;

public class BitwiseShifting {
  public static void main (String[] args) {

    // define variables
    int a = 3;                                   // integer value: 3
    String aBinary = Integer.toBinaryString(a);  // string containing the binary representation of a

    System.out.println("= Bitwise Signed Shifting =");

    // bitwise signed shifting to the left
    int signedLeftShift = a << 1;                // integer with the value shifted to the left
    String signedLeftShiftBinary = Integer.toBinaryString(signedLeftShift); // binary representation
    System.out.printf("%d (binary: %s) shifted to the left once results in %d (binary: %s)\n", a, aBinary, signedLeftShift, signedLeftShiftBinary);

    // bitwise signed shifting to the right
    int signedRightShift = a >> 1;               // integer with the value shifted to the right
    String signedRightShiftBinary = Integer.toBinaryString(signedRightShift); // binary representation
    System.out.printf("%d (binary: %s) shifted to the right once results in %d (binary: %s)\n", a, aBinary, signedRightShift, signedRightShiftBinary);

    System.out.println(" "); 
    System.out.println("= Bitwise Unsigned Shifting =");

    // bitwise unsigned shifting to the right
    a = -12;                                     // assign a different value to a: -12
    aBinary = Integer.toBinaryString(a);         // string containing the binary representation of a
    int unsignedRightShift = a >>> 1;            // integer with the value shifted to the right
    String unsignedRightShiftBinary = Integer.toBinaryString(unsignedRightShift); // binary representation
    System.out.printf("%d (binary: %s) shifted to the right once results in %d (binary: %s)\n", a, aBinary, unsignedRightShift, unsignedRightShiftBinary);

  }
}
