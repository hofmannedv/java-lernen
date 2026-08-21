// ------------------------------------------------------------------
// Demonstrates how to write data to a file. Overwrites file if it 
// already exists.
//
// Created file: localfile
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
// Usage: java Writefile
// ------------------------------------------------------------------

// import required modules
import java.io.FileWriter;  // write data
import java.io.IOException; // handle errors

public class Writefile {
  public static void main(String[] args) {

    try {
        // open file in write mode
        FileWriter myWriter = new FileWriter("localfile");
        myWriter.write("This is an example line\n");
        myWriter.close();
    } catch (IOException e) {
      // sth went wrong: cannot write data to file
      System.out.println("Cannot write to file");
      e.printStackTrace();
    }
  }
}
