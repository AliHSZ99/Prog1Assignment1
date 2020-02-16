/* This program will calculate the price of a user's 
 	product to give the price with Quebec's sales tax and
 	the price with an additional 15% tip. */

import java.util.Scanner;         // We import these java packages to
import java.text.DecimalFormat;   // be able to use the Scanner and DecimalFormat classes

public class Question2{
	public static void main(String[] args){

		System.out.println("\n***** Product Price *****"); 

		Scanner scan = new Scanner(System.in);                      // Here we use the Scanner class to
		System.out.print("\nEnter the price of a product > ");	    // get the product price of the user
		double product = scan.nextDouble();                         // as an input. 
		
		// Here we enter the values of the taxes and tips in decimal format
		double tPS = 0.05;      
		double tVQ = 0.0997;  
		double tips = 0.15;

		
		DecimalFormat percentPattern = new DecimalFormat("0.0#%");  // The DecimalFormat class is used her to create a percent pattern for the taxes

		System.out.println("\nHere are the values of sales tax in Quebec(TPS and TVQ):" +     // Here we print a message with the values of
			           "\n\nThe value of TPS is " + percentPattern.format(tPS) +          // the taxes using the DecimalFormat class to
				   "\nThe value of TVQ is " + percentPattern.format(tVQ) +            // to print the perecent pattern
				   "\nIn some instances, a tip of " + percentPattern.format(tips) +   
				   " may be added");

		
		double price = product + (product*tPS) + (product*tVQ);     // Here we calculate the price without the tip
		double priceWithTax = price + (price*tips);                 // Here we calculate the price with the tip

		
		DecimalFormat pricePattern = new DecimalFormat("$0.00"); // DecimalFormat class to create a pricenpattern										 
																											// This is where we print
		System.out.println("\nThe price of the product is " + pricePattern.format(price) + 		   // the values of the
				   "\nThe price of the product with a tip of " + percentPattern.format(tips) +     // products price
				   " would become " + pricePattern.format(priceWithTax));

		System.out.println("\n*************************");









		

		



		
	}
}
