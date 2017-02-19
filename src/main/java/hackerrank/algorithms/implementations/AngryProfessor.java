package hackerrank.algorithms.implementations;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/angry-professor
public class AngryProfessor {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numberOfTestCases = input.nextInt();
	while (numberOfTestCases != 0) {
	    int numberOfStudents = input.nextInt();
	    int leastRequired = input.nextInt();
	    int counter = 0;
	    for (int i = 0; i < numberOfStudents; i++) {
		if (input.nextInt() <= 0) {
		    counter++;
		}
	    }
	    if (counter >= leastRequired) {
		System.out.println("NO");
	    } else {
		System.out.println("YES");
	    }
	    numberOfTestCases--;
	}
	input.close();
    }

    public String isClassCanceled(int numberOfStudents, int leastRequired, int[] time) {
	int counter = 0;
	for (int i = 0; i < numberOfStudents; i++) {
	    if (time[i] <= 0) {
		counter++;
	    }
	}
	if (counter >= leastRequired) {
	    return "NO";
	} else {
	    return "YES";
	}
    }

}
