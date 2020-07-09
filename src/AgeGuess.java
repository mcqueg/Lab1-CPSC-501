//********************************************************************
//  Garrett McCue 	
//
//	7/08/20
//
//	CPSC-501-Lab1Ex3 
//  
// Prompts user and assigns input to variables "name" and "ageGuess"
// then returns each
//********************************************************************

import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name;
		int ageGuess;

		System.out.print("Enter name: ");

		name = scan.nextLine();

		System.out.print("Enter value for ageGuess: ");

		ageGuess = scan.nextInt();

		System.out.println("name: " + name);
		System.out.println("ageGuess: " + ageGuess);

	}

}
