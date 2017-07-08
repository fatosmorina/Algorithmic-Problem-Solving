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