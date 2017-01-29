/**
 * 
 */
package leetcode.easy;

/**
 * FatosMorina.com
 */
public class ReverseInteger {

    public int reverse(int x) {
	boolean isNegative = false;
	if (x < 0) {
	    isNegative = true;
	}
	StringBuilder answer = new StringBuilder();
	String numberAsString = x + "";
	if (isNegative) {
	    numberAsString = numberAsString.substring(1);
	    answer.insert(0, "-").append(new StringBuilder(numberAsString).reverse());
	} else {
	    answer.append(new StringBuilder(numberAsString).reverse());
	}
	long reversedNumber = Long.valueOf(answer.toString());
	if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
	    return 0;
	}
	return (int) reversedNumber;
    }

}
