package assignment

//1.	Encode and decode

//i.	Create two strings, one for a username and one for a password. 
//Concatenate them together, separated by a colon. 
//Use a method from the Groovy JDK to convert the resulting String to a byte array. 
//Then use the encodeBase64 method on byte array to create an encoded string.


String uname = "RHEGI"
String pass = "r123"

String c = uname + ":" + pass
 
byte[] b = c.getBytes();

def en = b.encodeBase64().toString()
//println en


//ii.	Decode the string by using the decodeBase64 method, and using the result as an argument to the String constructor. 
//Use the split method to return the original username and password.

 byte[] dec = en.decodeBase64()
// println d
 
def res =  new String(dec)
//println res

def original = res.split(':')
println original

