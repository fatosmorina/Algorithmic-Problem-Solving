package codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] array) {
	Set<Integer> uniqueElements = new HashSet<Integer>();
	for (int i = 0; i < array.length; i++) {
	    uniqueElements.add(array[i]);
	}
	for (int i = 1;; i++) {
	    if (!uniqueElements.contains(i)) {
		return i;
	    }
	}
    }
}
