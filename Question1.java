// This program calculates the price of a road trip

import java.util.Scanner;	      // Packages imported to use 
import java.text.DecimalFormat;   // Scanner and DecimalFormat class's

public class Question1{
	public static void main(String[] args){

		System.out.println("\n***** Roadtrip Cost *****");

		Scanner scan = new Scanner(System.in);						// Here we instantiate the Scanner 
		DecimalFormat pricePattern = new DecimalFormat("$0.00");    // and DecimalFormat class that we will use

		// Here we ask the user to input kilometers that will be traveled and we print that value 
		System.out.print("\nHow many kilometers will be traveled > ");
		double distance = scan.nextDouble();
		System.out.println("You will travel " + distance + "km.");

		// Here we ask the user the average distance that the vehicle can run with 1 liter of gas and print that value
		System.out.print("\nWhat is the average distance(in km) that the vehicle runs with 1 liter of gas? > ");
		double aveDistance = scan.nextDouble();
		System.out.println("Your vehicle can travel " + aveDistance + 
			           "km with 1 liter of gas.");

		double gasPrice = (distance/aveDistance)*1.16;            // Here we do the calculations
																  // to find the total cost of the trip
		System.out.println("\nThe total cost of the trip is " +   // and print the value using the 
			            pricePattern.format(gasPrice));       // DecimalFormat class

		System.out.println("\n*************************");								




	}
}
