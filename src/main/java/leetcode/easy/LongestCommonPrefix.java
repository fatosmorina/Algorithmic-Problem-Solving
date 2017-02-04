package leetcode.easy;
//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {
	int numberOfElements = strings.length;
	if (numberOfElements == 0) {
	    return "";
	} else if (numberOfElements == 1) {
	    return strings[0];
	}
	int minLength = strings[0].length();
	for (String string : strings) {
	    if (minLength > string.length()) {
		minLength = string.length();
	    }
	}
	int lastIndex = minLength;
	String prefix = strings[0].substring(0, lastIndex);
	for (int i = 0; i < numberOfElements; i++) {
	    if (!strings[i].substring(0, lastIndex).contains(prefix)) {
		i = -1;
		lastIndex = lastIndex - 1;
		prefix = strings[0].substring(0, lastIndex);
	    }
	}
	return prefix;
    }

}
