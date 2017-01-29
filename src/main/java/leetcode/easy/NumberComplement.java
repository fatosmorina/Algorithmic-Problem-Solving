package leetcode.easy;

public class NumberComplement {
//https://leetcode.com/problems/number-complement/
    public static int findComplement(int num) {
	String binary = Integer.toBinaryString(num);
	StringBuilder str = new StringBuilder();
	for (int i = 0; i < binary.length(); i++) {
	    if (binary.charAt(i) == '1') {
		str.append('0');
	    } else {
		str.append('1');
	    }
	}
	return Integer.parseInt(str.toString(), 2);
    }

}
