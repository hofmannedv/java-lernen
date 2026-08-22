// ------------------------------------------------------------------
// Demonstrates how to read the contents of a file, and treats it as
// comma-separated values. Uses ";" as a separator, replaces it by a
// tabulator, and prints the entire line to stdout
//
// Required file: localfile.csv
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// Inspired from: Java Read Files
// https://www.w3schools.com/java/java_files_read.asp
//
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Readfile
// ------------------------------------------------------------------

// import required modules
import java.io.File;
import java.io.FileNotFoundException; // handle errors
import java.util.Scanner;             // module to read text files

public class ReadfileCsvReplace {
  public static void main(String[] args) {
    // define a file object to read from localfile
    File myObj = new File("localfile.csv");

    // define separator pattern
    String regex = ";";
    String replace = "\t";

    // try to read from the file
    try (Scanner myReader = new Scanner(myObj)) {
      // ... as long as there are lines 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();

        // replace ";" by "\t"
        String dataWithReplacements = data.replaceAll(regex, replace);

        System.out.println("updated line: " + dataWithReplacements);
      }
    } catch (FileNotFoundException e) {
      // sth went wrong: file not found
      System.out.println("Cannot read from file");
      e.printStackTrace();
    }
  }
}
