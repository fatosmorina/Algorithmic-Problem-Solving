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

public class LibraryFine {
    static void solve() throws Exception {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("actualDay", nextInt());
	map.put("actualMonth", nextInt());
	map.put("actualYear", nextInt());
	map.put("expectedDay", nextInt());
	map.put("expectedMonth", nextInt());
	map.put("expectedYear", nextInt());
	System.out.println(getFine(map));

    }

    public static int getFine(Map<String, Integer> map) {
	int fine = 0;
	int expectedYear = map.get("expectedYear");
	int actualYear = map.get("actualYear");
	if (actualYear > expectedYear) {
	    fine = 10000;
	    return fine;
	}
	if (expectedYear > actualYear) {
	    return fine;
	}
	int expectedMonth = map.get("expectedMonth");
	int actualMonth = map.get("actualMonth");
	if (actualMonth > expectedMonth) {
	    fine = 500 * (actualMonth - expectedMonth);
	    return fine;
	}
	if (expectedMonth > actualMonth) {
	    return fine;
	}
	int actualDay = map.get("actualDay");
	int expectedDay = map.get("expectedDay");
	if (actualDay > expectedDay) {
	    fine = 15 * (actualDay - expectedDay);
	    return fine;
	}
	return fine;
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
