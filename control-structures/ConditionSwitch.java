// ------------------------------------------------------------------
// demonstrates testing for multiple conditions
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java ConditionSwitch
//
// ------------------------------------------------------------------

public class ConditionSwitch {
  public static void main (String[] args) {

    // define variables
    int result = 95;                   // define integer with test result

    // simple test for a specific value using if keyword
    // message is printed only if condition is met
    switch (result) {
      case 100:
        System.out.println("Bravo -- you have reached 100 points, and passed the test!");
        break;
    }

    // test for a range of specific values 
    // message is printed only if condition is met
    switch (result) {
      case 95,96,97,98,99,100:
        System.out.println("Bravo -- you have passed the test!");
        break;
      default:
        System.out.println("Unfortunately, you did not reach the minimum number of points. Keep trying.");
    }
  }
}
