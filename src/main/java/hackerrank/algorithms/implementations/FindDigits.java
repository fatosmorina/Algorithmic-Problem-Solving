package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/find-digits
public class FindDigits {
    static void solve() throws Exception {
	int numberOfTestCases = nextInt();
	while (numberOfTestCases != 0) {
	    int originalNumber = nextInt();
	    System.out.println(findDigits(originalNumber));
	}
    }

    public static int findDigits(int originalNumber) {
	int number = originalNumber;
	int counter = 0;
	while (number != 0) {
	    int currentDigit = number % 10;
	    if (currentDigit != 0 && originalNumber % currentDigit == 0) {
		counter++;
	    }
	    number = number / 10;
	}
	return counter;
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
