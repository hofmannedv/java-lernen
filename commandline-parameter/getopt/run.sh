#!/bin/bash

# ------------------------------------------------------------------------
# Run script to read commandline parameters using getopt
#
# (C) 2026 Frank Hofmann
# Released under GNU Public License (GPL)
# Email frank.hofmann@efho.de
# 
# License: GNU Public License (GPL) v.3.0 or later
# SPDX-License-Identifier: GNU General Public License v3.0 or later
# 
# Usage: ./run.sh Parameters
# 
# ------------------------------------------------------------------------

# define the classpath variable for the compiler
classpathCompiler="/usr/share/java/gnu-getopt.jar"

# extend the classpath variable for the interpreter by ".:"
classpathInterpreter=".:$classpathCompiler"

# start compiled program
# does the file actually exist?
if [[ -f "ParametersGetopt.class" ]]; then
  # yes, so we run the Java interpreter
  java -classpath "$classpathInterpreter" ParametersGetopt "$@"

else
  # cannot find named file
  echo "cannot find compiled program. Exiting."
  exit 1
fi

