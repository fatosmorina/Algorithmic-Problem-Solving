package leetcode.easy;

// https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {
    public int hammingWeight(int n) {
	String nAsString = Integer.toBinaryString(n);
	int counter = 0;
	for (int i = nAsString.length() - 1; i != -1; i--) {
	    if (nAsString.charAt(i) == '1') {
		counter++;
	    }
	}
	return counter;
    }

    //Second solution    
    public int hammingWeight2(int n) {
	int sum = 0;
	while (n != 0) {
	    sum++;
	    n = n & (n - 1);
	}
	return sum;
    }
}
