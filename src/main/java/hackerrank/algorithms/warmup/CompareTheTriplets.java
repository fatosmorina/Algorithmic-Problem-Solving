//https://www.hackerrank.com/challenges/compare-the-triplets

package hackerrank.algorithms.warmup;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CompareTheTriplets {
    static void solve() throws Exception {
        System.out.println(compareTheTriplets(getArray(), getArray()));
    }

    public static int[] compareTheTriplets(int[] a, int[] b) {
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] == b[i])
                continue;
            if (a[i] > b[i]) {
                aScore++;
            } else {
                bScore++;
            }
        }
        return new int[] { aScore, bScore };
    }

    private static int[] getArray() throws IOException {
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = nextInt();
        }
        return a;
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
