package com.tiy.baseball;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseballAdventureMode {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int i = 0;
		int numOfAtBats = 0;
		
		String testNum;
		String resultsTestNum;
		
		boolean repeat = false;

		ArrayList<Integer> resultsOfAtBat = new ArrayList<>();
		
		do {
			repeat = false;
			System.out.println("Enter the number of batters who you would like to calculate scores:");
			testNum = keyboard.next();
			try {
				i = Integer.parseInt(testNum);

			} catch (NumberFormatException e) {
				System.out.println("Error! Must enter a number!");
			}
			if (i > 0) {
				repeat = true;
			} else if (!(i > 0)) {
				System.out.println("Must enter a number greater than zero!");
				repeat = false;
			} else {
				repeat = false;
			}

		} while (!(repeat));
		
		ArrayList<ArrayList<Integer>> dataPerBatter = new ArrayList<ArrayList<Integer>>();
		

		for (int j = 0; j < i; j++) {
				dataPerBatter.add(EnterBaseballResults.storeInputs(resultsOfAtBat));
		}
		
		// let calculate data

		for (int j = 0; j < i; j++) {
			System.out.println("Batter " + (j + 1) + " Bats results are:");
				BaseballCalculator.battingAverage(dataPerBatter.get(j));
				BaseballCalculator.sluggingPercentage(dataPerBatter.get(j));
		}

		//System.out.println("ResultsOfAtBat:"+resultsOfAtBat);
		
		
		
	}

}


//System.out.println("Enter the total number of times at bat:");
//resultsTestNum = keyboard.next();
//try{
//	timesAtBat = Integer.parseInt(resultsTestNum);
//}catch (NumberFormatException e){
//	System.out.println("Error! Must enter a number!");
//}
//if (timesAtBat > 0){
//	repeat = true;
//} else if (!(i > 0)) {
//	System.out.println("Must enter a number greater than zero!");
//	repeat = false;
//} else {
//	repeat = false;
//}
