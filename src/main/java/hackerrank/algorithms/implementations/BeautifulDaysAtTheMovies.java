package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BeautifulDaysAtTheMovies {
    static void solve() throws Exception {
	int firstNumber = nextInt();
	int secondNumber = nextInt();
	int k = nextInt();
	int counterOfBeautifulDays = countBeautifulDays(firstNumber, secondNumber, k);
	System.out.println(counterOfBeautifulDays);
    }

    public static int countBeautifulDays(int firstNnumber, int lastNumber, int k) {
	int count = 0;
	for (int i = firstNnumber; i <= lastNumber; i++) {
	    int reversed = Integer.valueOf(new StringBuilder(i + "").reverse().toString());
	    if ((i - reversed) % k == 0) {
		count++;
	    }
	}

	return count;
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
