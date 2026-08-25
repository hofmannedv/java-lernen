// ------------------------------------------------------------------
// Demonstrates how to define a record
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java User
// ------------------------------------------------------------------

// define record User with id, first name, and last name
public record User(int id, String firstName, String lastName) {}
