package codility;

public class BinaryGap {
    public int solution(int N) {
	String binary = Integer.toBinaryString(N);
	int i = binary.length() - 1;
	while (binary.charAt(i) == '1') {
	    i--;
	}
	int gap = 0;
	int maxGap = 0;
	for (; i > -1; i--) {
	    if (binary.charAt(i) == '0') {
		gap++;
	    } else {
		maxGap = Math.max(gap, maxGap);
		gap = 0;
	    }
	}
	maxGap = Math.max(gap, maxGap);
	return maxGap;
    }
}
