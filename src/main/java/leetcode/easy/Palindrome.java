/**
 * 
 */
package leetcode.easy;

/**
 * Fatos Morina
 */
// https://leetcode.com/problems/palindrome-number/
public class Palindrome {
    public boolean isPalindrome(int x) {
	return new StringBuilder(x + "").reverse().toString().equals(x + "");
    }
}
