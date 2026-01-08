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
// ------------------------------------------------------------------

// import required Java module
import java.util.Random;

public class RandomInteger {
  public static void main (String[] args) {

    // create random object
    Random randomInteger = new Random();

    // calculate random integer
    int randomNumber = randomInteger.nextInt(100) + 1;
    System.out.println("Random number between 1, and 100: " + randomNumber);
  }
}
