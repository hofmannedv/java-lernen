// ------------------------------------------------------------------
// Demonstrates how to use a prevously defined Point class for 2D
// and create a list of 2D points
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: javac Point2dList.java
//        java Point2dList
// ------------------------------------------------------------------

import geometry.Point2d;
import java.util.ArrayList;

public class Point2dList {
    public static void main(String[] args) {

        // define data to work with
        double[] dataX = {4.0, 17.5, 2.73, 6.5, 9.3};
        double[] dataY = {2.0, 3.8, 0.4, 15.8, 2.5};

        // define a flexible array list of 2D points
        ArrayList<Point2d> pointlist = new ArrayList<Point2d>();        

        // process data
        for (int position = 0; position < dataX.length; position++) {
            // define new point based on Point2d class
            Point2d point = new Point2d(dataX[position], dataY[position]);

            // extend list of points, and add point to the end of the list
            pointlist.add(point);
        }

        // retrieve the stored value from the list, and print it to stdout
        for (Point2d point : pointlist) {
            double valueX = point.getX();
            double valueY = point.getY();
            System.out.printf("point value (x, y): (%f, %f)\n", valueX, valueY);
        }
    }
}
