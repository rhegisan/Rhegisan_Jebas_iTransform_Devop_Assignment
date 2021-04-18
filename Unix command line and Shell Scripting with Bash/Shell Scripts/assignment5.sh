#!/usr/bin/env bash
#Write a script that runs three commands:

#Evaluate an arithmetic expression
#Attempt to remove a file that does not exist in the current directory
#Evaluate another arithmetic expression


#Immediately after each command, echo the exit status of that command to the terminal using the appropriate variable to show success and failure exit codes.

declare -i a=4+4
echo $?

b=$(rm lol.txt) 
echo $?

declare -i c=4-5
echo $?
