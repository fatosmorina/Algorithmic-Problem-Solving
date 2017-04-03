package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/birthday-cake-candles
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfCandles = input.nextInt();
		int[] candleHeights = new int[numberOfCandles];
		for (int i = 0; i < numberOfCandles; i++) {
			candleHeights[i] = input.nextInt();
		}
		System.out.println(getMaxHeightCount(candleHeights));
		input.close();
	}

	public static int getMaxHeightCount(int[] candleHeights) {
		int numberOfCandles = candleHeights.length;
		Arrays.sort(candleHeights);
		int maxHeight = candleHeights[numberOfCandles - 1];
		int maxHeightCount = 0;
		for (int i = 0; i < numberOfCandles; i++) {
			if (candleHeights[i] == maxHeight) {
				maxHeightCount += 1;
			}
		}
		return maxHeightCount;
	}

}
