package uva;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JollyJumper {

	public static void main(String[] args) {
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

}