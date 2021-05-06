package assignment

import java.text.CharacterIterator

// 1.Sorting Strings
// Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending order.
// Advanced: Sort by length, then sort equal length strings alphabetically

//def Colors = ["red", "blue", "green", "black"]
//println Colors.sort()

//println Colors.sort { it.length() }

//println Colors.sort { -it.length() }

// println Colors.sort { String a, String b -> a.length() <=> b.length() ?: a <=> b }
 

 
//  2.Processing a list of numbers
//  Create a list of numbers. Add them together. First double each number, then add them up. Compute their average.

//def list = [1,2,3,4,5,6]
//  
//def add = list.sum()
//  
//def doub = list.sum { it * it }  
//
//def f = (add + doub)/2
//
//println "The average of " + add + " and "+  doub + " is "+ f



//3. Reading a web page
//Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page.

//def urlContents = "https://www.google.com/".toURL().getText()
//
//println  urlContents.eachLine { line -> println  line }
//
//println  urlContents.eachLine { line -> println "THE LINE IS : " + line + " AND IT'S SIZE IS : " + line.size() }
	 
	 
	
//4. Closures as a filter
//Create a list of numbers. Print all elements greater than zero.

//def numbers = [-1, 2, 3, 4, -2, -4]
//
//println numbers.findAll { it -> it > 0 } 


//5. Multi-line strings
//Make a multi-line string. Compute the number of vowels on each line.

//def str = """Hello im writing this line
//              just to find 
//              the number of vowels in it""".trim()

		  
//def  vowels = ['a','e','i','o','u']
//s = str.tokenize('\n')
//def f = s[0]
//def first = f.findAll { it -> it in vowels  }  
//println "First line has " + first.size() + " vowels"   
//
//def sec = s[1]
//def second = sec.findAll { it -> it in vowels  }
//println "Second line has " + second.size() + " vowels"

//def th = s[2]
//def third = th.findAll { it -> it in vowels  }
//println "Third line has " + third.size() + " vowels"



//6.	Padded binary output
//Print the numbers from 0 to 15 in binary (use Java's Integer.toBinaryString() method). 
//Use a method in String from the Groovy JDK to make all the output values have four digits.


//for ( int i = 0; i <= 15; i++ )
//{
// println (String.format("%4s", Integer.toBinaryString(i)).replace(' ','0')) 
//}






























