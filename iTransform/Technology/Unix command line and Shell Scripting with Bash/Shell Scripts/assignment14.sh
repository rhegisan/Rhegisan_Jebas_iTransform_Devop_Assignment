#!/usr/bin/env bash
#Develop a simple three item menu to display on the terminal. Your script, upon display of the menu, should prompt the user to choose one of the three available options. Using the 'case' statement from the course, display three unique messages depending on which number they chose, with a catch all message letting them know if they went outside the bounds of instructions.

echo "1.Jan"
echo "2.Feb"
echo "3.Mar"

echo "choose any of the number"
read word

if [[ $word -gt 0 ]] && [[ $word -lt 4 ]]
then
 case "$word" in
  "1") echo "january"
  ;;
 "2") echo "february"
  ;;
 "3") echo "March"
  ;;
 esac
else
echo "Your choice is out of scope"
fi
