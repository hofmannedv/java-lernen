#!/bin/bash

# ------------------------------------------------------------------------
# Build script to read commandline parameters using getopt
#
# (C) 2026 Frank Hofmann
# Released under GNU Public License (GPL)
# Email frank.hofmann@efho.de
# 
# License: GNU Public License (GPL) v.3.0 or later
# SPDX-License-Identifier: GNU General Public License v3.0 or later
# 
# Usage: ./build.sh
# 
# return codes:
# 0: compilation successful
# 1: one, or more project files cannot be found
# 2: one, or more project files fail to be compiled
# ------------------------------------------------------------------------

# define project files, and compilation order
projectFiles=("ParametersGetopt.java")

# adjust environment variable CLASSPATH
CLASSPATH="/usr/share/java/gnu-getopt.jar"
export CLASSPATH

# loop through the list of project files, and try to compile it
for entry in "${projectFiles[@]}"; do
  echo "processing $entry ..."

  # does the file actually exist?
  if [[ -f "$entry" ]]; then
    # compile, and evaluate the output for errors
    javac "$entry"

    # check for compilation error
    if [[ $? -ne 0 ]]; then
      echo "compilation failed. Exiting."
      exit 2
    fi
  else
    # cannot find named file
    echo "cannot find $entry. Exiting."
    exit 1
  fi
done

# compilation successful
echo "compilation successful"
exit 0
