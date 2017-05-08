package uva;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FactorialFrequenices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while (number != 0) {
			BigInteger product = BigInteger.ONE;
			for (int i = 2; i < number + 1; i++) {
				product = product.multiply(BigInteger.valueOf(i));
			}
			int[] digitCounter = new int[10];
			BigInteger productValue = product;
			while (!productValue.equals(BigInteger.ZERO)) {

				digitCounter[Integer.valueOf(productValue.mod(BigInteger.TEN)
						.toString())]++;
				productValue = productValue.divide(BigInteger.TEN);
			}
			formatOutput(number, digitCounter);
			number = input.nextInt();
		}
	}

	private static void formatOutput(int number, int[] digits) {
		System.out.println(number + "! --");
		for (int i = 0; i < 10; i++) {
			if (i != 0 || i != 9 || i != 4)
				System.out.printf("   ");
			System.out.printf("(%d)%5d", i, digits[i]);
			if (i == 4 || i == 9)
				System.out.printf("\n");
		}
	}
}
