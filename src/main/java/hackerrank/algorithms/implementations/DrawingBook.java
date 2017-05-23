//https://www.hackerrank.com/challenges/drawing-book

package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DrawingBook {
    static void solve() throws Exception {
        int n = nextInt();
        int p = nextInt();
        System.out.println(getMinimumNumberOfPage(n, p));
    }

    public static int getMinimumNumberOfPage(int n, int p) {
        if (p > n / 2)
            return (n - p) / 2;
        return p / 2;
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
