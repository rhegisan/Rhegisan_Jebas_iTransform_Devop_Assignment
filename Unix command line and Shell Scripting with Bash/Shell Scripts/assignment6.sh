#!/usr/bin/env bash
#Write a script that evaluates and displays the following arithmetic operations:

#Add two numbers
#Add two numbers and multiply by a third, do not group anything 
#Add two numbers, grouped (changing order of precedence) and multiply by a third

#Keep in mind special characters and/or escape characters as needed.


first=1
second=2
third=3

sum=$(($first + $second))
echo $sum

mul= expr $first + $second \* $third
echo $mul

echo $(($(($first + $second)) * $third)) 
 
