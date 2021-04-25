package assignment

//5.Prime Numbers
//Write a method called isPrime that takes an integer argument and returns a boolean. 
//Determine whether the number is prime by dividing it by all numbers from 2 up to one less than the number.
//That limit is too high, of course. How high do you have to check to be sure whether you've gone far enough?


//we only need to check until half (number/2) of the entered number.

  def isPrime(int a)
  {
	def i = 1
	
	  for (i ; i<= a/2; i++)
	  {
		 if (a%2 == 0)
		 {
			 return false
		 }
		 else 
	     {
			 return true
	     }	  
	  }		  
  }
  
 int number = 17
 s = isPrime(number)
 println s
 println s.getClass()
 
