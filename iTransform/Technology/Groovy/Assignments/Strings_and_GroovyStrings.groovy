package assignment

//4.	Strings and GroovyStrings

//a. How many characters are in the string "Hello, Groovy!"?


//14
def str = "Hello, Groovy!"
println str.size()
println str.length()



// b. Define a string variable containing a name. Print a hello statement with your name using string concatenation, then using a Groovy string.


def name = "RHEGISAN JEBAS"
println "Hello " + name 
println "Hello " .concat(name)



// c. Demonstrate that "racecar" is a palindrome by comparing it to its reverse. Do the same with "Bob", removing case sensitivity first.


def og = "racecar"
rev = og.reverse()
if (og == rev ) 
	println "Palindrome"
else
	println "Not Pallindrome"
	

def OG = "Bob"
reverse = OG.reverse()
if (OG.equalsIgnoreCase(reverse) )
	println "Palindrome"
else
	println "Not Pallindrome"



// d. Define a string variable containing the sentence, "Hello, World. How are you?". 
// Split the sentence into an array using the split method. Count the number of words.
// Do the same using the tokenize method.


def sentence = "Hello, World. How are you?"
arr = sentence.split()
println arr
println arr.size()


def s = "Hello, World. How are you?"
a = s.tokenize()
println a
println a.size()



//e. Using the same sentence, use array notation (square brackets) to print the substring "World".


def sent = "Hello, World. How are you?"
array = sentence.split()
println array[1]



//f. Use array notation to print the last word, but reversed.

def sentnce = "Hello, World. How are you?"
ar = sentnce.split()
println ar[-1].reverse()



























