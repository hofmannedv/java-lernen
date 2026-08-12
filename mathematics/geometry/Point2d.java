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
import geometry.Point1d;

public class Point2d {
    // define class variables x, and y as Point1d
    Point1d x = new Point1d(0.0);
    Point1d y = new Point1d(0.0);

    public Point2d (double valueX, double valueY) {
        // redefine constructor, and assign values for x, and y axis
        this.x.setValue(valueX);
        this.y.setValue(valueY);
    }

    public void setX(double value) {
        // assign a new value to class attribute x
        this.x.setValue(value);
    }

    public void setY(double value) {
        // assign a new value to class attribute y 
        this.y.setValue(value);
    }

    public double getX() {
        // return the stored x value
        return this.x.getValue();
    }

    public double getY() {
        // return the stored y value
        return this.y.getValue();
    }

}
