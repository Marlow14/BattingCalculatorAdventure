package com.tiy.baseball;

import java.util.ArrayList;

public class BaseballCalculator {

	public static float sluggingPercentage(ArrayList<Integer> input) {

		float resultsSum = 0;

		for (int i = 0; i < input.size(); i++) {

			resultsSum += input.get(i);

		}
		float sluggingPercentage = resultsSum / input.size();

		System.out.format("Your slugging percentage is:\n %.3f", sluggingPercentage);
		System.out.println("");
		return sluggingPercentage;

	}

	public static float battingAverage(ArrayList<Integer> input) {

		float results = 0;

		for (int i = 0; i < input.size(); i++) {

			if (input.get(i) > 0) {
				results++;
			}
		}
		float battingAverage = results / input.size();

		System.out.format("Your batting average is:\n %.3f", battingAverage);
		System.out.println("");
		return battingAverage;

	}

}

// DecimalFormat df = new DecimalFormat("#.####");
// System.out.print(df.format(sluggingPercentage));