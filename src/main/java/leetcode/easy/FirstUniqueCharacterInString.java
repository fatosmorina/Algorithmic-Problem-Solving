/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

// https://leetcode.com/problems/first-unique-character-in-a-string/

package leetcode.easy;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String string) {
	for (int i = 0; i < string.length(); i++) {
	    if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {
		return i;
	    }
	}
	return -1;
    }
}