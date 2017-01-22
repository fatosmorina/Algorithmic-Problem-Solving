package hackerrank.algorithms.implementations;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/designer-pdf-viewer
public class DesignerPDFViewer {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	String[] heights = input.nextLine().split(" ");
	char[] characters = input.nextLine().toCharArray();
	int length = characters.length;
	int max = 0;

	for (char c : characters) {
	    int currentHeight = Integer.valueOf(heights[c - 'a']);
	    if (currentHeight > max) {
		max = currentHeight;
	    }
	}

	System.out.println(length * max);
	input.close();
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
	    solve();
	} catch (Throwable e) {
	    e.printStackTrace();
	    exit(0);
	}
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
}
