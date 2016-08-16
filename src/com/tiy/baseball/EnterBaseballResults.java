package com.tiy.baseball;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.tiy.baseball.*;

public class EnterBaseballResults {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Integer> batResults = null;

		BaseballCalculator bc = new BaseballCalculator();

		batResults = storeInputs(batResults);

		bc.battingAverage(batResults);
		bc.sluggingPercentage(batResults);

	}

	public static ArrayList<Integer> storeInputs(ArrayList<Integer> batResults) {

		batResults = new ArrayList<>();

		int noOfAtBats;
		int number;
		boolean valid = true;

		do {

			System.out.println("To calculate batting average and slugging percentage\n"
					+ "enter the number of total times you batted:");
			noOfAtBats = keyboard.nextInt();

			if (noOfAtBats > 0) {

				valid = true;
			} else if (!(noOfAtBats > 0)){

				System.out.println("Invalid!");
				valid = false;
			}

		} while (!(valid));

		for (int i = 0; i < noOfAtBats; i++) {

			do {

				System.out.println("Enter bat result number " + (i + 1) + ":");

				valid = true;

				int testInput = keyboard.nextInt();

				if ((testInput >= 0) && (testInput <= 4)) {

					batResults.add(testInput);

					valid = true;

				} else {

					valid = false;

				}

			} while (!(valid));

		}

		return batResults;
	}

}

// ArrayList<Integer> batters = null;

// EnterBaseballResults ebbr = new EnterBaseballResults();

//batters = storeBatters(batters);

//public static ArrayList<Integer> storeBatters(ArrayList<Integer> batters)
	// {
	//
	// int noOfBatters = 0;
	//
	// System.out.println("Enter the total number of batters:");
	//
	// noOfBatters = keyboard.nextInt();
	//
	// for (int i = 0; i < noOfBatters; i++) {
	//
	// }
	//
	// return batters;
	// }