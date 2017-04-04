package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/apple-and-orange

public class AppleAndOrange {

    static void solve() throws Exception {
	int firstCoordinateOfHouse = nextInt();
	int secondCoordinateOfHouse = nextInt();
	int appleCenter = nextInt();
	int orangeCenter = nextInt();
	int numberOfApples = nextInt();
	int numberOfOranges = nextInt();
	int appleCounter = 0;
	int orangeCounter = 0;

	for (int i = 0; i < numberOfApples; i++) {
	    int currentDistance = nextInt();
	    if (currentDistance < 0) {
		continue;
	    }
	    int distance = appleCenter + currentDistance;
	    if (distance >= firstCoordinateOfHouse && distance <= secondCoordinateOfHouse) {
		appleCounter++;
	    }
	}

	for (int i = 0; i < numberOfOranges; i++) {
	    int currentDistance = nextInt();
	    if (currentDistance > 0) {
		continue;
	    }
	    int distance = orangeCenter + currentDistance;
	    if (distance >= firstCoordinateOfHouse && distance <= secondCoordinateOfHouse) {
		orangeCounter++;
	    }
	}
	System.out.println(appleCounter);
	System.out.println(orangeCounter);
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
