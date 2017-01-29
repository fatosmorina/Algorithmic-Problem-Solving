package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
	Set<Integer> sumSet = new HashSet<Integer>();
	int[] digits = extractDigits(n);
	int sum = 0;
	while (sumSet.add(sum)) {
	    sum = 0;
	    for (int i = 0; i < digits.length; i++) {
		sum = sum + digits[i] * digits[i];
	    }
	    if (sum == 1) {
		return true;
	    }
	    digits = extractDigits(sum);
	}
	return false;
    }

    public int[] extractDigits(int n) {
	int[] digits = new int[(n + "").length()];
	for (int i = 0; i < digits.length; i++) {
	    digits[i] = n % 10;
	    n = n / 10;
	}
	return digits;
    }
}
