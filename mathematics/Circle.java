// (C) 2025 Frank Hofmann, email info@efho.de
// Licensed under General Public License (GPL)

// demonstrates how to calculate area, and circumference of a circle
// usage: java Circle

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
