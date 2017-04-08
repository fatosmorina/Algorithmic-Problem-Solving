package uva;

import java.math.BigInteger;
import java.util.Scanner;

public class BasicRemains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int baseNumber = input.nextInt();
			if (baseNumber == 0) {
				break;
			}
			BigInteger p = new BigInteger(input.next(), baseNumber);
			BigInteger m = new BigInteger(input.next(), baseNumber);
			System.out.println((p.mod(m)).toString(baseNumber));
		}
	}
}