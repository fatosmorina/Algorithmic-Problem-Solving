package leetcode.easy;

/**
 * Fatos Morina
 */
public class FindTheDifference {
//https://leetcode.com/problems/find-the-difference/
    public char findTheDifference(String s, String t) {
	int sum = 0;
	for (int i = 0; i < s.length(); i++) {
	    sum ^= s.charAt(i);
	}
	for (int i = 0; i < t.length(); i++) {
	    sum ^= t.charAt(i);
	}
	return (char) sum;
    }
}
