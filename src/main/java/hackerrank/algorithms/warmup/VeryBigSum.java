package hackerrank.algorithms.warmup;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/a-very-big-sum
public class VeryBigSum {
    static void solve() throws Exception {
        System.out.println(getSumOfArrayElements(getArray()));
    }

    public static long getSumOfArrayElements(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int[] getArray() throws IOException {
        int[] array = new int[nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = nextInt();
        }
        return array;
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
