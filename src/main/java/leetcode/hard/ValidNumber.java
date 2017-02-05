package leetcode.hard;

//https://leetcode.com/problems/valid-number/
public class ValidNumber {
    public boolean isNumber(String s) {
	if (s == null || "".equals(s) || s.contains("f") || s.contains("F") || s.contains("d") || s.contains("D")) {
	    return false;
	}
	try {
	    Double.parseDouble(s);
	} catch (NumberFormatException e) {
	    return false;
	}
	return true;
    }
}
