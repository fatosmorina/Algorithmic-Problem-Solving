package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/the-hurdle-race
public class HurdleRace {
    static void solve() throws Exception {
        int numberOfHurdles = nextInt();
        int initialJumpHeight = nextInt();
        int[] heights = new int[numberOfHurdles];
        for (int i = 0; i < numberOfHurdles; i++) {
            heights[i] = nextInt();
        }
        System.out.println(getMinimalNumberOfBeverages(initialJumpHeight, heights));
    }

    public static int getMinimalNumberOfBeverages(int initialJumpHeight, int[] heights) {
        int difference = getMaximalNumberOfArray(heights) - initialJumpHeight;
        if (difference <= 0) {
            return 0;
        }
        return difference;
    }

    private static int getMaximalNumberOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
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
