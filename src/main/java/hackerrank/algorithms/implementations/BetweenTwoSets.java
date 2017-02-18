package hackerrank.algorithms.implementations;

//https://www.hackerrank.com/challenges/between-two-sets
public class BetweenTwoSets {
    public int solution(int[] a, int[] b) {
	int n = a.length;
	int m = b.length;
	int leastCommonMultiple = a[0];
	int greatestCommonDivisor = b[0];
	int counter = 0;
	for (int i = 1; i < n; i++) {
	    leastCommonMultiple = lcm(leastCommonMultiple, a[i]);
	}
	for (int j = 1; j < m; j++) {
	    greatestCommonDivisor = gcd(greatestCommonDivisor, b[j]);
	}
	for (int i = leastCommonMultiple, j = 2; i < greatestCommonDivisor + 1; i = leastCommonMultiple * j, j++) {
	    if (greatestCommonDivisor % i == 0) {
		counter++;
	    }
	}
	return counter;
    }

    public int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	}
	return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
	return a * (b / gcd(a, b));
    }
}
