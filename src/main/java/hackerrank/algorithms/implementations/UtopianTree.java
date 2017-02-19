package hackerrank.algorithms.implementations;

public class UtopianTree {
    public int[] solution(int[] testCases) {
	int length = testCases.length;
	int[] result = new int[length];
	for (int i = 0; i < length; i++) {
	    boolean wasDoubled = false;
	    int height = 1;
	    for (int j = 0; j < testCases[i]; j++) {
		if (wasDoubled) {
		    height = height + 1;
		    wasDoubled = false;
		} else {
		    height = height * 2;
		    wasDoubled = true;
		}
	    }
	    result[i] = height;
	}
	return result;
    }
}
