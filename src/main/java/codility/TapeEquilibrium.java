package codility;

public class TapeEquilibrium {
    public int solution(int[] array) {
	int minimalDifference = Integer.MAX_VALUE;
	int rightSum = 0;
	int leftSum = 0;
	int length = array.length;
	for (int i = 0; i < length; i++) {
	    rightSum = rightSum + array[i];
	}
	for (int i = 0; i < length; i++) {
	    leftSum = leftSum + array[i];
	    rightSum = rightSum - array[i];
	    minimalDifference = Math.min(minimalDifference, Math.abs(leftSum - rightSum));
	}
	return minimalDifference;
    }
}
