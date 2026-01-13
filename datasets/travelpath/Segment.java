// ------------------------------------------------------------------
// Defines a class containing two place names, and the distance 
// between the places
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Segment
//
// ------------------------------------------------------------------

public class Segment {

  // define attributes
  private String startingPoint;        // name of the starting point
  private String endPoint;             // name of the endpoint
  private int distance;                // distance between the points

  int getDistance () {
    return distance;                   // return the stored value
  }

  void setDistance (int newValue) {
    distance = newValue;               // assign a new value
  }

  int getStartingPoint () {
    return startingPoint;              // return the stored name
  }

  void setStartingPoint (String newName) {
    startingPoint = newName;           // assign a new name for the starting point
  }

  int getEndPoint () {
    return endPoint;                   // return the stored name
  }

  void setEndPoint (String newName) {
    endPoint = newName;                // assign a new name for the endpoint
  }
}
