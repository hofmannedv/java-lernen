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

  public static int findShortestSegment (ArrayList<Segment> travelPath) {

    int result = 0;                    // define result as first segment

    if (travelPath.isEmpty()) {
      // cannot work with an empty list
      System.out.println("Cannot work with an empty list");
      result = -1;                     // signal to the caller: empty list
    } else {

      int position = 0;                // start with the first segment
      int shortestDistance = travelPath.get(0).getDistance(); // assume first segment

      for (Segment currentTrack: travelPath) {
        System.out.println("evaluating segment " + position);
        System.out.println("comparing " + currentTrack.getDistance() + " with " + shortestDistance);
        if (currentTrack.getDistance() < shortestDistance) {
          result = position;           // we found a shorter segment
          System.out.println("new shortest segment is " + result);
        } else {
          System.out.println("keeping " + result + " as the shortest segment" );
        }
        position = position + 1;       // check the next segment
      }
    }
    return result;                     // return the shortest segment
  }

  public static int findLongestSegment (ArrayList<Segment> travelPath) {

    int result = 0;                  // define result as first segment

    if (travelPath.isEmpty()) {
      // cannot work with an empty list
      System.out.println("Cannot work with an empty list");
      result = -1;                     // signal to the caller: empty list
    } else {

      int position = 0;                // start with the first segment
      int longestDistance = travelPath.get(0).getDistance(); // assume first segment

      for (Segment currentTrack: travelPath) {
        System.out.println("evaluating segment " + position);
        System.out.println("comparing " + currentTrack.getDistance() + " with " + longestDistance);
        if (currentTrack.getDistance() > longestDistance) {
          result = position;           // we found a longer segment
          System.out.println("new longest segment is " + result);
        } else {
          System.out.println("keeping " + result + " as the longest segment" );
        }
        position = position + 1;       // check the next segment
      }
    }
    return result;                     // return the longest segment
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

    // output shortest segment
    System.out.println(" ");
    System.out.println("finding shortest segment in travel path ...");
    int position = findShortestSegment(roadtrip);
    if (position > -1) {
      Segment shortestSegment = roadtrip.get(position);
      String fromPlace = shortestSegment.getStartingPoint();
      String toPlace = shortestSegment.getEndPoint();
      int distance = shortestSegment.getDistance();
      System.out.printf("the shortest segment is between %s, and %s (%d km) \n", fromPlace, toPlace, distance);
    }

    // output longest segment
    System.out.println(" ");
    System.out.println("finding longest segment in travel path ...");
    position = findLongestSegment(roadtrip);
    if (position > -1) {
      Segment longestSegment = roadtrip.get(position);
      String fromPlace = longestSegment.getStartingPoint();
      String toPlace = longestSegment.getEndPoint();
      int distance = longestSegment.getDistance();
      System.out.printf("the longest segment is between %s, and %s (%d km) \n", fromPlace, toPlace, distance);
    }
  }
}

