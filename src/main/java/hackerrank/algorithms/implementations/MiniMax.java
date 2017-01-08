package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.hackerrank.com/challenges/mini-max-sum
public class MiniMax {
    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	String[] line = input.nextLine().split(" ");
	long[] arrays = new long[line.length];
	for (int i = 0; i < line.length; i++) {
	    arrays[i] = Long.valueOf(line[i]);
	}
	Arrays.sort(arrays);
	long min = 0;
	long max = 0;
	for (int i = 0; i < 4; i++) {
	    min = min + arrays[i];
	}

	for (int i = 1; i < 5; i++) {
	    max = max + arrays[i];
	}
	System.out.println(min + " " + max);
	input.close();
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
