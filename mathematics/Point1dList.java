// ------------------------------------------------------------------
// Demonstrates how to use a prevously defined Point class for 1D
// and create a list of 1D points
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point1dList.java
//        java Point1dList
// ------------------------------------------------------------------

import geometry.Point1d;
import java.util.ArrayList;

public class Point1dList {
    public static void main(String[] args) {

        // define data to work with
        double[] data = {4.0, 17.5, 2.73, 6.5, 9.3};

        // define a flexible array list of 1D points
        ArrayList<Point1d> pointlist = new ArrayList<Point1d>();        

        // process data
        for (double value : data) {
            // define new point based on Point1d class
            Point1d point = new Point1d(value);

            // extend list of points, and add point to the end of the list
            pointlist.add(point);
        }

        // retrieve the stored value from the list, and print it to stdout
        for (Point1d point : pointlist) {
            double value = point.getValue();
            System.out.println("point value: " + value);
        }
    }
}
