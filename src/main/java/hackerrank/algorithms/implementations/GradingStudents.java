package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/grading
public class GradingStudents {
    static void solve() throws Exception {
        int numberOfStudents = nextInt();
        while (numberOfStudents != 0) {
            System.out.println(roundGrade(nextInt()));
            numberOfStudents--;
        }
    }

    static int nextInt() throws IOException {
        return parseInt(next());
    }

    public static int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }
        int roundedGrade = grade;
        int ratio = grade / 5;
        int nextFactor = (ratio + 1) * 5;
        if ((nextFactor - grade) < 3) {
            roundedGrade = nextFactor;
        }
        return roundedGrade;
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
