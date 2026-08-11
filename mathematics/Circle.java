// ------------------------------------------------------------------
// Demonstrates how to calculate area, and circumference of a circle
//
// (C) 2025-2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Circle
// ------------------------------------------------------------------

public class Circle {
  public static void main (String[] args) {

    // define pi
    double pi = 3.1415926;

    // define radius of the circle
    double radius = 5.0;

    // calculate area
    double area = pi * radius * radius;

    // calculate circumference
    double circumference = 2.0 * pi * radius;

    // output area, and circumference 
    // output format: 3 digits before, and 3 digits after the decimal point
    System.out.printf("based on a radius of 5.0, the circle covers an area of %3.3f \n", area);
    System.out.printf("based on a radius of 5.0, the circumference of the circle is %3.3f \n", circumference);
  }
}
