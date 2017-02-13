package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] array) {
	Set<Integer> set = new HashSet<Integer>();
	for (int i = 0; i < array.length; i++) {
	    set.add(array[i]);
	}
	return set.size();
    }
}
