/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

//https://leetcode.com/problems/add-digits/
package leetcode.easy;

public class AddDigits {

    public int addDigits(int number) {
	if (number == 0) {
	    return 0;
	}
	if (number % 9 == 0) {
	    return 9;
	}
	return number % 9;
    }

    //second solution
    public int addDigitsWithLoops(int number) {
	int sum = 0;
	while (number != 0) {
	    sum = sum + number % 10;
	    number = number / 10;
	}
	int finalSum = 0;
	while (sum != 0) {
	    finalSum = finalSum + sum % 10;
	    sum = sum / 10;
	}
	return finalSum;
    }
}
