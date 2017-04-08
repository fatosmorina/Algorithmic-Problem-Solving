package google.code.jam;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem

Tatiana likes to keep things tidy. Her toys are sorted from smallest to largest, her pencils are sorted from shortest to longest and her computers from oldest to newest. One day, when practicing her counting skills, she noticed that some integers, when written in base 10 with no leading zeroes, have their digits sorted in non-decreasing order. Some examples of this are 8, 123, 555, and 224488. She decided to call these numbers tidy. Numbers that do not have this property, like 20, 321, 495 and 999990, are not tidy.

She just finished counting all positive integers in ascending order from 1 to N. What was the last tidy number she counted?

Input

The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with a single integer N, the last number counted by Tatiana.

Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the last tidy number counted by Tatiana.

Limits

1 ≤ T ≤ 100.
Small dataset

1 ≤ N ≤ 1000.
Large dataset

1 ≤ N ≤ 1018.
Sample


Input 
 	
Output 
 
4
132
1000
7
111111111111111110

Case #1: 129
Case #2: 999
Case #3: 7
Case #4: 99999999999999999
 
 */
public class TidyNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		int currentCase = 1;
		while (numberOfTestCases != 0) {
			System.out.println("Case #" + currentCase + ": " + getTidyNumber(input.nextBigInteger()));
			numberOfTestCases--;
			currentCase++;
		}
	}

	public static BigInteger getTidyNumber(BigInteger n) {
		while (true) {
			int[] digits = new int[n.toString().length()];
			int i = digits.length - 1;
			BigInteger originalNumber = n;
			while (!n.equals(BigInteger.ZERO)) {
				digits[i] = n.mod(BigInteger.TEN).intValue();
				n = n.divide(BigInteger.TEN);
				i--;
			}
			if (isTidyNumber(digits)) {
				return originalNumber;
			}
			n = originalNumber.subtract(BigInteger.ONE);
		}
	}

	public static boolean isTidyNumber(int[] digits) {
		for (int i = 0; i < digits.length-1; i++) {
			if (digits[i] > digits[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
