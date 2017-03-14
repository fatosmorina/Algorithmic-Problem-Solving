package hackerrank.algorithms.warmup;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

///https://www.hackerrank.com/challenges/plus-minus
public class PlusMinus {
    static void solve() throws Exception {
        int n = nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nextInt();
        }
        double[] result = getArrayOfNumbers(array);
        for (int i = 0; i < 3; i++) {
            System.out.println(result[i]);
        }
    }

    public static double[] getArrayOfNumbers(int[] array) {
        int n = array.length;
        int numberOfNegativeNumbers = 0;
        int numberOfPositiveNumbers = 0;
        int numberOfZeros = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                numberOfPositiveNumbers++;
            } else if (array[i] < 0) {
                numberOfNegativeNumbers++;
            } else {
                numberOfZeros++;
            }
        }
        return new double[] { numberOfPositiveNumbers / (double) n, numberOfNegativeNumbers / (double) n, numberOfZeros / (double) n };
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
