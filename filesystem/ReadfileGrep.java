// ------------------------------------------------------------------
// Demonstrates how to read the contents of a file, and prints all
// lines to standard out that contain a substring specified as 
// Regular Expression. Acts similar to the UNIX/Linux command grep.
//
// Required file: localfile
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
// Usage: java ReadfileGrep
// ------------------------------------------------------------------

// import required modules
import java.io.File;
import java.io.FileNotFoundException; // handle errors
import java.util.Scanner;             // module to read text files
import java.util.regex.Matcher;       // module to match a pattern
import java.util.regex.Pattern;       // module to define a pattern

public class ReadfileGrep {
  public static void main(String[] args) {
    // define a file object to read from localfile
    File myObj = new File("localfile");

    // define line counter
    int lineCounter = 1;

    // search term as regular expression: allo 
    Pattern pattern = Pattern.compile("allo");

    // try to read from the file
    try (Scanner myReader = new Scanner(myObj)) {
      // ... as long as there are lines 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        Matcher matcher = pattern.matcher(data);

        if (matcher.find()) {
            // we found a line that contains the term we look for
            // print line to stdout
            System.out.println(lineCounter + ": " + data);
        }
        lineCounter = lineCounter + 1;
      }
    } catch (FileNotFoundException e) {
      // sth went wrong: file not found
      System.out.println("Cannot read from file");
      e.printStackTrace();
    }
  }
}
