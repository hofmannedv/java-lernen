// ------------------------------------------------------------------
// demonstrates testing for a specific condition 
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java Condition
//
// ------------------------------------------------------------------

public class Condition {
  public static void main (String[] args) {

    // define variables
    int result = 95;                   // define integer with test result

    // simple test for a value using if keyword
    // message is printed only if condition is met
    if (result > 50) {
       System.out.println("Bravo -- you have passed the test!");
    }

    // test for a value using if keyword, and alternative using else
    // first message is printed only if condition is met, otherwise the second message
    result = 45;                       // redefine integer with test result
    if (result > 50) {
       System.out.println("Bravo -- you have passed the test!");
    } else {
       System.out.println("Unfortunately, you did not reach the minimum number of points. Keep trying.");
    }

    // test for a value using if keyword, an alternative using else if, and an alternative using else
    // first message is printed only if first condition is met
    // second message is printed only if first condition is not met
    // third message is printed only if both first, and second condition are not met
    result = 55;                       // redefine integer with test result
    if (result > 75) {
       System.out.println("You did very well -- more than 75 points!");
    } else if (result > 50) {
       System.out.println("Bravo -- you have passed the test!");
    } else {
       System.out.println("Unfortunately, you did not reach the minimum number of points. Keep trying.");
    }
  }
}
