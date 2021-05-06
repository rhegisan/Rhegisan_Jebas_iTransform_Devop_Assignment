#!/usr/bin/env bash
#Write a script that assigns a variable that contains a list of all shell scripts (*.sh) in the current directory (command redirection). Using the 'for'statement from the course, iterate through that list of files and display the filename of each and cat out the contents to the terminal.

var1=$(ls *.sh)

for  i in $var1 
do
v=$( cat $i )
echo "The file name is $i and the contents of the files are as follows:"
echo "$v"
echo "------------------------------------------------------------------"
done
