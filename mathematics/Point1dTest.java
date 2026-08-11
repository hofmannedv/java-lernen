// ------------------------------------------------------------------
// Demonstrates how to use a prevously defined Point class for 1D
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point1dTest.java
//        java Point1dTest
// ------------------------------------------------------------------

import geometry.Point1d;

public class Point1dTest {
    public static void main(String[] args) {
        // define new point
        Point1d point = new Point1d();

        // assign value of 4.0
        point.setX(4.0);

        // retrieve value, and print it
        double value = point.getX();
        System.out.print("x value: " + value + "\n");
    }
}
