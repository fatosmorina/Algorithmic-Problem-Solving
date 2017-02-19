package hackerrank.algorithms.implementations;

public class UtopianTree {
    public int solution(int value) {
	boolean wasDoubled = false;
	int height = 1;
	for (int j = 0; j < value; j++) {
	    if (wasDoubled) {
		height = height + 1;
		wasDoubled = false;
	    } else {
		height = height * 2;
		wasDoubled = true;
	    }
	}
	return height;
    }
}
