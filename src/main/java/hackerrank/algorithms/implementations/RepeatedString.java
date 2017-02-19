package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/repeated-string
public class RepeatedString {
    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	System.out.println(getNthLetter(next(), nextLong()));
	input.close();
    }

    public static long getNthLetter(String input, long index) {
	if (!input.contains("a")) {
	    return 0;
	}
	int length = input.length();
	long ratio = index / length;
	long remainder = index % length;
	long counter = countALetter(input, length) * ratio + countALetter(input, remainder);
	return counter;
    }

    public static long countALetter(String input, long upperLimit) {
	long counter = 0;
	for (int i = 0; i < upperLimit; i++) {
	    if (input.charAt(i) == 'a') {
		counter++;
	    }
	}
	return counter;
    }

    static int nextInt() throws IOException {
	return parseInt(next());
    }

    static long nextLong() throws IOException {
	return parseLong(next());
    }

    static String next() throws IOException {
	while (tok == null || !tok.hasMoreTokens()) {
	    tok = new StringTokenizer(in.readLine());
	}
	return tok.nextToken();
    }

    public static void main(String[] args) {
	try {
	    in = new BufferedReader(new InputStreamReader(System.in));
	    out = new PrintWriter(new OutputStreamWriter(System.out));
	    solve();
	    in.close();
	    out.close();
	} catch (Throwable e) {
	    e.printStackTrace();
	    exit(0);
	}
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
}
