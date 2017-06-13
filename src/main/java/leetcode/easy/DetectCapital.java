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
