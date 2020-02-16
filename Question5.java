/* This program prints a random number between 0 and 100
   and prints 5 different mathematical operations on it:
   powers of 2 and 3, square root, natural logarithm and 
   base 10 logarithm */

import java.util.Random;  // packages imported to use Random class
import java.lang.*;       // and 

public class Question5{
	public static void main(String[] args){

		System.out.println("\n***** Random Number *****");

		// Here we instantiate the Random class 
		Random random = new Random();

		int number = random.nextInt(101);              // This is where the random number is 
		System.out.println("\nThe random number is " +   // found and printed 
							number);
 
		System.out.println("\nHere are five mathematical operations performed on " + number + ":");

		// Here are where all the mathematical operations are done using the Math class 
		System.out.println("\n" + number + " raised to the power of 2 is " +
							Math.pow(number, 2));

		System.out.println(number + " raised to the power of 3 is " +
							Math.pow(number, 3));

		System.out.println("The square root of " + number + " is " +
							Math.sqrt(number));

		System.out.println("The natural logarithm of " + number + " is " +  
							Math.log(number));

		System.out.println("The base 10 logarithm of " + number + " is " +
							Math.log10(number));

		System.out.println("\n*************************");





	}
}