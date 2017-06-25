/**
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
 * 
 * Input Format
 * 
 * The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.
 * 
 * Constraints
 * -100 <= Elements in the matrix <= 100
 * Output Format
 * 
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * 
 * Sample Input
 * 
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output
 * 
 * 15
 * Explanation
 * 
 * The primary diagonal is:
 * 
 * 11
 *   5
 *   -12
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * 
 * The secondary diagonal is:
 * 
 *     4
 *   5
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19 
 * Difference: |4 - 19| = 15
 * 
 */

//https://www.hackerrank.com/challenges/diagonal-difference/submissions/code/20132371

package hackerrank.algorithms.warmup;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DiagonalDifference {
    static void solve() throws Exception {
        int length = nextInt();
        int[][] matrix = new int[length][length];
        for (int c = 0; c < length; c++) {
            for (int d = 0; d < length; d++) {
                matrix[c][d] = nextInt();
            }
        }
        System.out.println(findDifferenceOfDiagonals(matrix));
    }

    public static int findDifferenceOfDiagonals(int[][] matrix) {
        int firstSum = 0;
        int secondSum = 0;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            firstSum = firstSum + matrix[i][i];
        }
        for (int i = length - 1; i > -1; i--) {
            secondSum = secondSum + matrix[length - (i + 1)][i];
        }
        return Math.abs(firstSum - secondSum);
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
