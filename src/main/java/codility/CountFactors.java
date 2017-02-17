package codility;

public class CountFactors {
    public int solution(int N) {
	int counter = 0;
	int upperLimit = (int) Math.round(Math.sqrt(N));
	if (upperLimit * upperLimit == N) {
	    counter++;
	}
	if (upperLimit * upperLimit >= N) {
	    upperLimit--;
	}
	for (int i = 1; i <= upperLimit; i++) {
	    if (N % i == 0) {
		counter += 2;
	    }
	}
	return counter;
    }
}
