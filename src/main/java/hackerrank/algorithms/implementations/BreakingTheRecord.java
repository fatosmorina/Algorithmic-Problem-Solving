package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class BreakingTheRecord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores = new int[input.nextInt()];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		int[] results = getRecordsInfo(scores);
		System.out.println(results[0] + " " + results[1]);
		input.close();
	}

	public static int[] getRecordsInfo(int[] scores) {
		int highestCount = 0;
		int lowestCount = 0;
		int highestValue = scores[0];
		int lowestValue = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > highestValue) {
				highestCount++;
				highestValue = scores[i];
			} else if (scores[i] < lowestValue) {
				lowestCount++;
				lowestValue = scores[i];
			}
		}
		return new int[] { highestCount, lowestCount };
	}
}
