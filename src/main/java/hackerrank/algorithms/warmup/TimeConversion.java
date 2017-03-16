package hackerrank.algorithms.warmup;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/time-conversion
public class TimeConversion {
    static void solve() throws Exception {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine()
            .split(":");
        System.out.println(getFormattedTime(elements));
        input.close();
    }

    public static String getFormattedTime(String[] elements) {
        int hours = Integer.valueOf(elements[0]);
        String minutes = elements[1];
        String seconds = elements[2].substring(0, 2);
        String period = elements[2].substring(2);
        if (period.equals("PM") && hours != 12) {
            hours = hours + 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = hours % 12;
        }
        StringBuilder hoursString = new StringBuilder();
        if (hours < 10) {
            hoursString.append("0");
        }
        hoursString.append(hours);
        StringBuilder output = new StringBuilder(hoursString + ":" + minutes + ":" + seconds);
        return output.toString();
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
