package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/kangaroo
public class Kangaroo {
    static void solve() throws Exception {
	int x1 = nextInt();
	int v1 = nextInt();
	int x2 = nextInt();
	int v2 = nextInt();
	if (x2 > x1 && v2 >= v1) {
	    System.out.println("NO");
	} else {
	    double difference = (x2 - x1) * 1.0 / (v1 - v2);
	    if (Math.floor(difference) == Math.ceil(difference) && difference >= 0) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}

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
