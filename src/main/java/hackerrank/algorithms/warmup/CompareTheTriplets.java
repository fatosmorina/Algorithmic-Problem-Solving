/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
 * 
 * We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
 * 
 * Your task is to find their comparison points by comparing  with ,  with , and  with .
 * 
 * If , then Alice is awarded  point.
 * If , then Bob is awarded  point.
 * If , then neither person receives a point.
 * Comparison points is the total points a person earned.
 * 
 * Given  and , can you compare the two challenges and print their respective comparison points?
 * 
 * Input Format
 * 
 * The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
 * The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
 * 
 * Sample Input
 * 
 * 5 6 7
 * 3 6 10
 * Sample Output
 * 
 * 1 1 
 * Explanation
 * 
 * In this example:
 * 
 * Now, let's compare each individual score:
 * 
 * , so Alice receives  point.
 * , so nobody receives a point.
 * , so Bob receives  point.
 * Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
 *
 */

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
