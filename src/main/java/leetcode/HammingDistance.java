package leetcode;

public class HammingDistance {
    // https://leetcode.com/problems/hamming-distance/

    public int hammingDistance(int x, int y) {
	StringBuilder xAsString = new StringBuilder(Integer.toBinaryString(x));
	StringBuilder yAsString = new StringBuilder(Integer.toBinaryString(y));
	int maxLength = Integer.max(xAsString.length(), yAsString.length());
	while (xAsString.length() != maxLength) {
	    xAsString.insert(0, "0");
	}
	while (yAsString.length() != maxLength) {
	    yAsString.insert(0, "0");
	}
	int counter = 0;
	for (int i = 0; i < maxLength; i++) {
	    if (xAsString.charAt(i) != yAsString.charAt(i)) {
		counter++;
	    }
	}
	return counter;
    }

}
