/* This program scans URL's to evaluate it to
   tell the user if it is valid and secure */

import java.util.Scanner;
import java.lang.*;

public class Question4{
	public static void main(String[] args){

		System.out.println("\n***** URL Scanner *****");

		Scanner scan = new Scanner(System.in);  // Here we instantiate the Scanner class
		System.out.print("\nEnter a URL > ");   // to be able to get the user's URL as
		String uRL = scan.next();               // an input

		String httpsLength = "";            // Here we create an empty string and give it a length using
		httpsLength = uRL.substring(0, 8);  // the substring method because https:// has 8 characters
		
		// Here we print a message that gives the length of the URL
		System.out.println("Verifying a URL with " + uRL.length() + " characters...");

		boolean https = httpsLength.equals("https://"); // Here we use boolean to use it as the condition in our if statement

		if(https){															 // Here we evalute the condition
			System.out.println("\nIs this a valid and secure URL? true");    // given in boolean and print the 
		} else {															 // corresponding message depending
			System.out.println("\nIs this a valid and secure URL? false");   // on the users input
		}

		System.out.println("\n***********************");



	}
}