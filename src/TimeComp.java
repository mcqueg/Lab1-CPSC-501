//********************************************************************
//  Garrett McCue 	
//
//	7/09/20
//
//	CPSC-501-Lab1Ex4 
// 
// Prompts user and for number of seconds and returns the equivalent
// hours, minutes, and seconds 
//
//********************************************************************

import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int totalSeconds, hours, minutes, seconds;

		System.out.print("Enter the number of seconds: ");
		totalSeconds = scan.nextInt();

		// 1 hour = 3600 seconds
		// calculates number of whole hours in user input based on
		// seconds in an hour.
		hours = totalSeconds / 3600;

		// Calculates whole minutes from the remaining seconds after
		// calculating number of hours
		minutes = (totalSeconds - (hours * 3600)) / 60;

		// finds total remaining seconds in user input
		seconds = totalSeconds - ((hours * 3600) + (minutes * 60));

		System.out.println(totalSeconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and "
				+ seconds + " seconds.");

	}

}
