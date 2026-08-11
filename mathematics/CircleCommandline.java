// ------------------------------------------------------------------
// Demonstrates how to calculate area, and circumference of a circle
// radius is read from commandline as an input parameter
//
// (C) 2025-2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java CircleCommandline value
//
// ------------------------------------------------------------------

public class CircleCommandline {
  public static void main (String[] args) {

    // define pi
    double pi = 3.1415926;

    // define radius of the circle, and read from commandline
    double radius = Double.parseDouble(args[0]);

    // calculate area
    double area = pi * radius * radius;

    // calculate circumference
    double circumference = 2.0 * pi * radius;

    // output area, and circumference 
    // output format: 3 digits before, and 3 digits after the decimal point
    System.out.printf("based on a radius of %f, the circle covers an area of %3.3f \n", radius, area);
    System.out.printf("based on a radius of %f, the circumference of the circle is %3.3f \n", radius, circumference);
  }
}
