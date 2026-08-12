// ------------------------------------------------------------------
// Demonstrates how to use a prevously defined Point class for 2D
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point2dTest.java
//        java Point2dTest
// ------------------------------------------------------------------

import geometry.Point2d;

public class Point2dTest {
    public static void main(String[] args) {
        // define new point, value of 4.0
        Point2d point = new Point2d(4.0, 12.5);

        // retrieve value, and print it
        double x = point.getX();
        double y = point.getY();
        System.out.printf("point value (x, y): (%f, %f)\n", x, y);
    }
}
