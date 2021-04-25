package assignment

// 1. Number Data Types

// a. What data type is the number 2? How about 20? 200? Keep adding zeros and watch the data type change until it reaches BigInteger.
// Then do the same for 2.0.

//Integer
def a = 2000000000
println "Datatype of $a : " + a.getClass()

//Long
def b = 2000000000000000000
println "Datatype of $b : " + b.getClass()

//BigInteger
def c = 20000000000000000000
println "Datatype of $c : " + c.getClass()

//BigDecimal
def d = 2.0
println "Datatype of $d : " + d.getClass()

//BigDecimal
def e = 2.00000000000000
println "Datatype of $c : " + e.getClass()


//  b. Declare a variable x of type def and assign it the sum of 1 and 1.5. What is the resulting data type?

//BigDecimal
a = 1
b = 1.5
def x = (a + b)
println "Datatype of $x : " + x.getClass()


// c. What do you get when you divide 5 by 2? What is the resulting data type? If you wanted to do integer division (no remainder),
// what method would you call?

//BigDecimal
a = 5/2
println "Datatype of $a : " + a.getClass()

//intdiv()
a = 5.intdiv(2)
println "Datatype of $a : " + a.getClass()






