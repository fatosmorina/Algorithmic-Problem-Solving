package leetcode.easy;

public class CountPrimes {

    public int countPrimes(int n) {
	int counter = 0;
	boolean[] isPrime = generatePrimes(n);
	for (int i = 0; i < isPrime.length; i++) {
	    if (isPrime[i]) {
		counter++;
	    }
	}
	return counter;
    }

    public static boolean[] generatePrimes(int number) {
	boolean[] isPrime = new boolean[number];
	for (int i = 2; i < number; i++) {
	    isPrime[i] = true;
	}
	for (int i = 2; i * i < number; i++) {
	    if (isPrime[i]) {
		for (int j = i; j * i < number; j++) {
		    isPrime[i * j] = false;
		}
	    }
	}
	return isPrime;
    }
}
