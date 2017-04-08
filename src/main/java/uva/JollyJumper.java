package uva;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=submit_problem&problemid=979&category=
public class JollyJumper {

	static void solve() {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			Set<Integer> numbersAlreadyAdded = new HashSet<Integer>();
			int numberOfElements = input.nextInt();
			int[] numbers = new int[numberOfElements];
			for (int i = 0; i < numberOfElements; i++) {
				numbers[i] = input.nextInt();
			}
			for (int i = 0; i < numberOfElements - 1; i++) {
				int difference = Math.abs(numbers[i] - numbers[i + 1]);
				if (difference > 0 && difference < numberOfElements) {
					numbersAlreadyAdded.add(difference);
				}
			}
			if (numbersAlreadyAdded.size() == (numberOfElements - 1)) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
		}
	}

	public static int findMaximalElement(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		solve();
	}

}