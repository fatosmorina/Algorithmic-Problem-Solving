/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * 
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */

//https://leetcode.com/problems/detect-capital/?tab=Description

package leetcode.easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
	int length = word.length();
	if (length >= 2) {
	    char first = word.charAt(0);
	    char second = word.charAt(1);
	    if (Character.isLowerCase(first) && Character.isUpperCase(second)) {
		return false;
	    } else if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
		for (int i = 2; i < length; i++) {
		    if (Character.isLowerCase(word.charAt(i))) {
			return false;
		    }
		}
		return true;
	    }

	}
	if (Character.isLowerCase(word.charAt(0))) {
	    for (int i = 1; i < length; i++) {
		if (!Character.isLowerCase(word.charAt(i))) {
		    return false;
		}
	    }
	} else {
	    for (int i = 1; i < length; i++) {
		if (!Character.isLowerCase(word.charAt(i))) {
		    return false;
		}
	    }
	}
	return true;
    }
}
