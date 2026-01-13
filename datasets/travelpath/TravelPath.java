// ------------------------------------------------------------------
// Demonstrates creating a travel path
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java TravelPath.java
// 
// ------------------------------------------------------------------

import java.util.ArrayList;            // import the ArrayList class

public class TravelPath {

  public static int calculateTotalDistance (ArrayList<Segment> travelPath) {

    int totalDistance = 0;             // assume the distance is 0
    for (Segment currentTrack: travelPath) {
      totalDistance += currentTrack.getDistance();
    }

    return totalDistance;              // return the calculated value
  }

  public static void main (String[] args) {

    // define an empty list of places, and its distance
    ArrayList<Segment> roadtrip = new ArrayList<Segment> ();

    Segment trackA = new Segment("Basel", "Mulhouse", 33);
    Segment trackB = new Segment("Mulhouse", "Belfort", 42);
    Segment trackC = new Segment("Belfort", "Besancon", 98);

    // combine segments into a roadtrip
    roadtrip.add(trackA);   
    roadtrip.add(trackB);   
    roadtrip.add(trackC);   

    // output the roadtrip track by track
    System.out.println("= Roadtrip Overview =");
    // - number of tracks
    int length = roadtrip.size();
    System.out.println("the roadtrip contains " + length + " track(s)");
    System.out.println(" ");

    // - from, to, and distance
    for (Segment currentTrack: roadtrip) {
       String fromPlace = currentTrack.getStartingPoint();
       String toPlace = currentTrack.getEndPoint();
       int distance = currentTrack.getDistance();
       System.out.printf("from %s to %s (%d km) \n", fromPlace, toPlace, distance);
    }

    // output total travelling distance
    int totalDistance = calculateTotalDistance(roadtrip);
    System.out.println(" ");
    System.out.printf("total distance: %d km\n", totalDistance);
  }
}

