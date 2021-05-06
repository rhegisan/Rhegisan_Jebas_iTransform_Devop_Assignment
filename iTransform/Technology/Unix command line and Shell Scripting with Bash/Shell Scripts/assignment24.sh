#!/usr/bin/env bash

#We are going to use nested functions to simulate the kind of abstraction you find in many object oriented languages. Create the following structures in your script:

#a function that defines two local variables to hole the number of arms and legs that a human being has.
#nested functions, one for each a male and female, that contain the appropriate number of beards that each gender has.
#capture the gender as a command line parameter.
#test the command line parameter and call the appropriate functions in order to display the characteristics of the indicated gender.



gender () {
local arms=2
local legs=2
f="Female"
 if [[ $1 == $f ]] 
 then
    Female;
 else
    Male;
 fi
}
  Female() {
   echo "Female"
    }

  Male() {
   echo "Male"
  }

func=$(gender $1)
echo "$func"
