package uva;

import java.util.Scanner;

public class LastNonZeroDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			long n = input.nextInt();
			long m = input.nextInt();
			long product = 1;
			for (long i = (n - m + 1); i < n + 1; i++) {
				product = product * i;
				while (product % 10 == 0) {
					product = product / 10;
				}
				product = product % (long) (Math.pow(10, 11));
			}
			String number = product + "";
			for (int i = number.length() - 1; i > -1; i--) {
				char c = number.charAt(i);
				if (c != '0') {
					System.out.println(c);
					break;
				}
			}
		}
	}

}