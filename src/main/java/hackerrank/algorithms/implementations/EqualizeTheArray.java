package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/equality-in-a-array
public class EqualizeTheArray {

    static void solve() throws Exception {
	int number = nextInt();
	Map<Integer, Integer> frequencyCounter = new HashMap<Integer, Integer>();
	for (int i = 0; i < number; i++) {
	    int currentNumber = nextInt();
	    frequencyCounter.put(currentNumber, frequencyCounter.getOrDefault(currentNumber, 0) + 1);
	}
	int maxCount = Integer.MIN_VALUE;
	for (Integer integer : frequencyCounter.values()) {
	    if (maxCount < integer) {
		maxCount = integer;
	    }
	}
	System.out.println(number - maxCount);
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
