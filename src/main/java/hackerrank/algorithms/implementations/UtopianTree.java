package hackerrank.algorithms.implementations;
//https://www.hackerrank.com/challenges/utopian-tree
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
