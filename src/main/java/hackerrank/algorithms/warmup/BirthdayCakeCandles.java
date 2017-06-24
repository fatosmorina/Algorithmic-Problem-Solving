/**
 * Colleen is turning  years old! Therefore, she has  candles of various heights on her cake, and candle  has height . Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.
 * 
 * Given the  for each individual candle, find and print the number of candles she can successfully blow out.
 * 
 * Input Format
 * 
 * The first line contains a single integer, , denoting the number of candles on the cake. 
 * The second line contains  space-separated integers, where each integer  describes the height of candle .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print the number of candles Colleen blows out on a new line.
 * 
 * Sample Input 0
 * 
 * 4
 * 3 2 1 3
 * Sample Output 0
 * 
 * 2
 * Explanation 0
 * 
 * We have one candle of height 1, one candle of height 2, and two candles of height 3. Colleen only blows out the tallest candles, meaning the candles where height = 3. Because there are 2 such candles, we print 2 on a new line.
 */

//https://www.hackerrank.com/challenges/birthday-cake-candles

package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

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
