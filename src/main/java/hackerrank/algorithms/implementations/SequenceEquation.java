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

//https://www.hackerrank.com/challenges/permutation-equation
public class SequenceEquation {
    static void solve() throws Exception {
        int number = nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= number; i++) {
            map.put(nextInt(), i);
        }
        Map<Integer, Integer> result = getInverse(map);
        for (int i = 1; i < number + 1; i++) {
            System.out.println(result.get(i));
        }
    }

    public static Map<Integer, Integer> getInverse(Map<Integer, Integer> inputMap) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i < inputMap.size(); i++) {
            map.put(i, inputMap.get(inputMap.get(i)));
        }
        return map;
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
