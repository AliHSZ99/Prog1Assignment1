/* This program asks the user to input a 3 digit
   whole number and calculates the sum of that number */

import java.util.Scanner;        // packages imported to use Scanner
import java.text.DecimalFormat;  // and DecimalFormat class

public class Question3{
	public static void main(String[] args){

		System.out.println("\n***** The Sum of a 3 Digit Number *****");

		// Here we instantiate the Scanner and then ask the user for the 3 digit whole number and print it
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter a whole number containing 3 digits > ");
		String number = scan.next();
		System.out.println("The number chosen is " + number);

		String integer1 = number.substring(0, 1);   // Here we seperate each 
		String integer2 = number.substring(1, 2);   // digit using the 
		String integer3 = number.substring(2);      // substring method

		int conversion1 = Integer.parseInt(integer1);  // Here we convert our strings into integers
		int conversion2 = Integer.parseInt(integer2);  // using Wrapper class(parseInt method)
		int conversion3 = Integer.parseInt(integer3);  // to be able to the sum of each digit

		int sum = conversion1 + conversion2 + conversion3;            
		//Here we entered the sum and printed the message and the value to the console
		System.out.println("\nThe sum of the digits entered is " +
				   sum);

		System.out.println("\n***************************************");

	


		



	}
}
