package leetcode;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MaxConsequetiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
	int counter = 0;
	int maxCounter = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		while (i < nums.length && nums[i] != 0) {
		    counter++;
		    i++;
		}
	    }
	    if (counter > maxCounter) {
		maxCounter = counter;
	    }
	    counter = 0;
	}
	return maxCounter;
    }

    static void solve() throws Exception {
	int[] numbers = { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
	System.out.println(findMaxConsecutiveOnes(numbers));
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
