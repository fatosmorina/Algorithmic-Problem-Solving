package leetcode;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReverseVowelsOfAString {

    static void solve() throws Exception {

    }

    public static String reverseVowels(String s) {
	StringBuilder vowelsOfWord = new StringBuilder();
	StringBuilder consonantsOfWord = new StringBuilder();

	Map<Integer, Character> map = new HashMap<Integer, Character>();
	for (int i = 0; i < s.length(); i++) {
	    map.put(i, s.charAt(i));
	}
	for (int i = 0; i < s.length(); i++) {
	    char character = s.charAt(i);
	    if (isVowel(character)) {
		vowelsOfWord.append(s.charAt(i));
	    } else {
		consonantsOfWord.append(s.charAt(i));
	    }
	}
	StringBuilder answer = new StringBuilder();

	vowelsOfWord = vowelsOfWord.reverse();
	int lastIndexOfVowels = 0;
	int lastIndexOfConsonants = 0;
	int numberOfVowels = vowelsOfWord.length();
	for (int i = 0; i < s.length(); i++) {
	    if (isVowel(s.charAt(i)) && lastIndexOfVowels != numberOfVowels) {
		answer.append(vowelsOfWord.charAt(lastIndexOfVowels));
		lastIndexOfVowels = lastIndexOfVowels + 1;
	    } else {
		answer.append(consonantsOfWord.charAt(lastIndexOfConsonants));
		lastIndexOfConsonants = lastIndexOfConsonants + 1;
	    }
	}
	return answer.toString();

    }

    public static boolean isVowel(char c) {
	String character = (c + "").toLowerCase();
	if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o")
		|| character.equals("u")) {
	    return true;
	}
	return false;
    }

    static int nextInt() throws IOException {
	return parseInt(next());
    }

    static String next() throws IOException {
	while (tok == null || !tok.hasMoreTokens()) {
	    tok = new StringTokenizer(in.readLine());
	}
	return tok.nextToken();
    }

    public static void main(String[] args) {
	try {
	    solve();
	    System.out.println(reverseVowels("hello"));
	} catch (Throwable e) {
	    e.printStackTrace();
	    exit(0);
	}
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
}
