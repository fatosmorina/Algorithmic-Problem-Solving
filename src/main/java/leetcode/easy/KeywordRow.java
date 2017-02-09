package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/keyboard-row/
public class KeywordRow {
    public String[] findWords(String[] words) {
	List<String> array = new ArrayList<String>();
	for (String word : words) {
	    if (containsLettersOfTheSameRow(word)) {
		array.add(word);
	    }
	}
	String[] result = new String[array.size()];
	for (int i = 0; i < array.size(); i++) {
	    result[i] = array.get(i);
	}
	return result;
    }

    public boolean containsLettersOfTheSameRow(String word) {
	String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
	word = word.toLowerCase();
	boolean isIncludedInFirst = false;
	boolean isIncludedInSecond = false;
	boolean isIncludedInThird = false;
	for (int i = 0; i < word.length(); i++) {
	    String c = "" + word.charAt(i);
	    if (rows[0].contains(c)) {
		isIncludedInFirst = true;
	    }
	    if (rows[1].contains(c)) {
		isIncludedInSecond = true;
	    }
	    if (rows[2].contains(c)) {
		isIncludedInThird = true;
	    }

	    if ((isIncludedInFirst && isIncludedInSecond) || (isIncludedInFirst && isIncludedInThird)
		    || (isIncludedInThird && isIncludedInSecond)) {
		return false;
	    }
	}
	return true;
    }

}
