package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int x, int[] array) {
	Set<Integer> uniqueElements = new HashSet<Integer>();
	for (int i = 0; i < array.length; i++) {
	    uniqueElements.add(array[i]);
	    if (x == uniqueElements.size()) {
		return i;
	    }
	}
	return -1;
    }
}
