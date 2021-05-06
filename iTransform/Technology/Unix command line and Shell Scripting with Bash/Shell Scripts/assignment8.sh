#!/usr/bin/env bash
#Create a script that interacts with the user. You will want to prompt the user to enter the following information (which you will capture and place into the following variables):

#FIRSTNAME
#LASTNAME
#USERAGE

#Greet the user with their name and current age displayed and then calculate and display their age in 10 years.



echo "Enter your Firstname"
read fname

echo "Enter your Lastname"
read lname

echo "Enter your Age"
read age

echo "Hey $fname $lname your current age is $age"

let age=age+10
echo "Your age after 10 years will be $age" 
