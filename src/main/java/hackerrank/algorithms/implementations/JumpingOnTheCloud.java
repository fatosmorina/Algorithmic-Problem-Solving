package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.awt.font.NumericShaper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class JumpingOnTheCloud {
    static void solve() throws Exception {
	int numberOfClouds = nextInt();
	int jumpDistance = nextInt();
	int[] clouds = new int[numberOfClouds];
	for (int i = 0; i < numberOfClouds; i++) {
	    clouds[i] = nextInt();
	}
	System.out.println(getEnergyBalance(numberOfClouds, jumpDistance, clouds));
    }

    public static int getEnergyBalance(int numberOfClouds, int jumpDistance, int[] clouds) {
	int energy = 100;
	int i = 0;
	int length = clouds.length;
	while ((i + jumpDistance) % length != 0) {
	    int currentCloud = clouds[(i + jumpDistance) % length];
	    if (currentCloud == 1) {
		energy = energy - 3;
	    } else {
		energy = energy - 1;
	    }
	    i = i + jumpDistance;
	}
	energy = energy - 1;
	if (clouds[0] == 1) {
	    return energy - 2;
	}
	return energy;
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
