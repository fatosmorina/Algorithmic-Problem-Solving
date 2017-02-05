package leetcode.hard;

//https://leetcode.com/problems/strong-password-checker/

//TODO Fix some cases
public class StrongPasswordChecker {

    public int strongPasswordChecker(String s) {
	int length = s.length();
	boolean containsLowerCase = false;
	boolean containsUpperCase = false;
	boolean containsDigit = false;
	boolean containsThreeRepeatingInARow = false;
	int counterOfRepeatedPatterns = 0;
	int counter = 0;
	if (length == 0) {
	    return 6;
	}
	if (length < 6) {
	    counter = counter + (6 - length);
	    return counter;
	} else if (length > 20) {
	    counter = counter + (length - 20);
	}
	for (int i = 0; i < length; i++) {
	    char character = s.charAt(i);
	    if (i > 1 && (length - i > 2) && character == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
		containsThreeRepeatingInARow = true;
		counterOfRepeatedPatterns++;
	    }
	    if (Character.isDigit(character)) {
		containsDigit = true;
	    } else if (Character.isLowerCase(character)) {
		containsLowerCase = true;
	    } else if (Character.isUpperCase(character)) {
		containsUpperCase = true;
	    }
	    if (!containsThreeRepeatingInARow && containsDigit && containsUpperCase && containsLowerCase && length > 5
		    && length < 21) {
		return 0;
	    }
	}
	if (containsThreeRepeatingInARow) {
	    counter = counter + counterOfRepeatedPatterns;
	}
	if (!containsDigit) {
	    counter++;
	}
	if (!containsLowerCase) {
	    counter++;
	}
	if (!containsUpperCase) {
	    counter++;
	}
	return counter;
    }
}
