package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/cut-the-sticks
public class CutTheSticks {
    static void solve() throws Exception {
	int numberOfSticks = nextInt();
	int[] array = new int[numberOfSticks];
	for (int i = 0; i < numberOfSticks; i++) {
	    array[i] = nextInt();
	}
	System.out.println(cutTheSticks(array));
    }

    public static String cutTheSticks(int[] array) {
	int size = array.length;
	StringBuilder output = new StringBuilder(size + "");
	Arrays.sort(array);
	int min = array[0];
	for (int i = 1; i < size; i++) {
	    if (array[i] > min) {
		min = array[i];
		output.append("\n" + (size - i));
	    }
	}
	return output.toString();
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
