// ------------------------------------------------------------------
// Demonstrates how to define a Point class for 1D
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point1d.java
// ------------------------------------------------------------------

package geometry;

public class Point1d {
    // define class variable x
    double x;

    public Point1d (double value) {
        // redefine constructor
        x = value;
    }

    public void setX(double value) {
        // assign x class attribute with value
        x = value;
    }

    public double getX() {
        // return the stored value
        return x;
    }
}
