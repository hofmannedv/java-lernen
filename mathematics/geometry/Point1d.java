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
    // define class variable value
    double value;

    public Point1d (double value) {
        // redefine constructor, and init class variable value
        this.value = value;
    }

    public void setValue(double value) {
        // assign value to class variable value
        this.value = value;
    }

    public double getValue() {
        // return the value of the stored class variable value
        return this.value;
    }
}
