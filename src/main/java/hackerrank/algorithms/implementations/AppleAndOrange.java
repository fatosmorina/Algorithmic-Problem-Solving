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

		int[] appleDistances = new int[numberOfApples];
		int[] orangeDistances = new int[numberOfOranges];

		
		for (int i = 0; i < numberOfApples; i++) {
			int currentDistance = nextInt();
			if (currentDistance < 0) {
				continue;
			}
			appleDistances[i] = currentDistance;
		}

		for (int i = 0; i < numberOfOranges; i++) {
			int currentDistance = nextInt();
			if (currentDistance > 0) {
				continue;
			}
			orangeDistances[i] = currentDistance;
		}
		System.out.println(getFruitCounter(firstCoordinateOfHouse, appleCenter, secondCoordinateOfHouse, appleDistances));;
		System.out.println(getFruitCounter(firstCoordinateOfHouse, orangeCenter, secondCoordinateOfHouse, orangeDistances));;
	}
	
	
	public static int getFruitCounter(int firstCoordinateOfHouse, int center, int secondCoordinateOfHouse, int[] distances){
		int counter = 0;
		for(int i = 0; i<distances.length; i++){
			int distance = center + distances[i];
			if (distance >= firstCoordinateOfHouse && distance <= secondCoordinateOfHouse) {
				counter++;
			}
		}
		return counter;		
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
