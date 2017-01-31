/**
 * 
 */
package leetcode.easy;

/**
 * Fatos Morina
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
	return new StringBuilder(x + "").reverse().toString().equals(x + "");
    }
}
