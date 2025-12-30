// ------------------------------------------------------------------
// demonstrates how to display an input window using SWING
// input field is a standard SWING entry box with description, and buttons
// simple code without any input validation
//
// (C) 2025 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java Inputfield
// ------------------------------------------------------------------

// import required Java module
import javax.swing.*;

public class Inputfield {
  public static void main (String[] args) {

  // define input field
  String entryfield = JOptionPane.showInputDialog("Wie heißen Sie?");
  
  // output entered data
  System.out.println("Hallo, " + entryfield + " :-)");
  }
}
