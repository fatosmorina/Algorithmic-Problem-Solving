package leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
	if (s.length() != t.length()) {
	    return false;
	}
	char[] sCharacters = s.toCharArray();
	char[] tCharacters = t.toCharArray();
	Arrays.sort(sCharacters);
	Arrays.sort(tCharacters);
	for (int i = 0; i < sCharacters.length; i++) {
	    if (sCharacters[i] != tCharacters[i]) {
		return false;
	    }
	}
	return true;
    }
}
