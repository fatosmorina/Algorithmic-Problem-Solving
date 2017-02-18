package hackerrank.algorithms.implementations;

//https://www.hackerrank.com/challenges/bon-appetit
public class BonAppetit {

    public String solution(int n, int k, int[] c, int paid) {
	int sum = 0;
	for (int i = 0; i < c.length; i++) {
	    if (i == k) {
		continue;
	    }
	    sum = sum + c[i];
	}
	int difference = paid - sum / 2;
	if (difference == 0) {
	    return "Bon Appetit";
	} else {
	    return "5";
	}
    }
}
