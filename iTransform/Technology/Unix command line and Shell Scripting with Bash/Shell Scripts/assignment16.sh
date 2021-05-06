#!/usr/bin/env bash
#Create a simple text file containing a list of super heros (or some names if preferred), use at least four values, one per line in the file.

#Write a bash shell script that then reads that file and displays it line by line on the terminal window.


i=1
while read line
do
echo "this is line no  $i : $line"
let i=i+1
done < hero.txt

#hero.txt
#hulk
#batman
#spiderman
#superman
