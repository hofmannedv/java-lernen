// ------------------------------------------------------------------
// Demonstrates calculation of random integers
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java RandomInteger
//
// Further reading:
// Meenakshi Agarwal: Generating Random Numbers Between 1 and 100 in Java
// https://dev.to/meenakshi052003/generating-random-numbers-between-1-and-100-in-java-i3b
// ------------------------------------------------------------------

// import required Java module
import java.util.Random;

public class RandomInteger {
  public static void randomSingleInteger () {
    // create random object
    Random randomInteger = new Random();

    // calculate random integer
    int randomNumber = randomInteger.nextInt(100) + 1;
    System.out.println("Random number between 1, and 100: " + randomNumber);
  }

  public static void randomMultipleInteger (int numberOfRandomIntegers) {
    // create random object
    Random randomInteger = new Random();

    // create random numbers in a for loop
    for (int i = 0; i < numberOfRandomIntegers; i++) {
      int randomNumber = randomInteger.nextInt(100) + 1;
      System.out.println("Random number " + (i + 1) + ": " + randomNumber);
    }
  }

  public static void main (String[] args) {
    // create a single random integer
    randomSingleInteger();

    // create a 10 random integer values
    randomMultipleInteger(10);
  }
}
