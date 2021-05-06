package assignment

//Create a class called Course, with a String attribute called name and an int attribute called days. 
//Create a list of four course instances, where at least two have the same number of days. 
//Sort the list by number of days. Then, sort the list by days, but when the days are equal, sort by name.

class Course 
{
	
	String name
	int days
	
	def getvalues( String n, int d)
	{
		def	name = n
		def days = d
		def l = [name : n, days : d]
	

	}
	
	static void main (args) 
	{
							
		Course first = new Course()
		Course second = new Course()
		Course third = new Course()
		Course fourth = new Course()
		
		
	def f = [first.getvalues("Roger",1),second.getvalues("Adam",1),
			 third.getvalues("Steve",3),fourth.getvalues("John",4)]	
//	println f
	
	def sorted = f.sort( {a, b -> b["days"] <=> a["days"] ?: a["name"] <=> b["name"] } )
	sorted.each { println it }

	}
}
		
		
		
		
		
		
		
		
	
	
	

