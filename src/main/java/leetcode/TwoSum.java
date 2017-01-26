package leetcode;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
	int[] indices = new int[2];
	for (int i = 0; i < nums.length-1; i++) {
	    for (int j = i+1; j < nums.length; j++) {
		if ((nums[i] + nums[j]) == target) {
		    indices[0] = i;
		    indices[1] = j;
		    Arrays.sort(indices);
		    return indices;
		}
	    }
	}
	Arrays.sort(indices);
	return indices;
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
	    int[] array = { 0, 4, 3, 0 };
	    twoSum(array, 0);
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
