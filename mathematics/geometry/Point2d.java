// ------------------------------------------------------------------
// Demonstrates how to define a Point class for 2D based on Point1d
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point2d.java
// ------------------------------------------------------------------

package geometry;

public class Point2d extends Point1d {
    // define class variable y
    double y;

    public Point2d (double value) {
        // redefine constructor
        y = value;
    }

    public void setY(double value) {
        // assign y class attribute with value
        y = value;
    }

    public double getY() {
        // return the stored y value
        return y;
    }
}
