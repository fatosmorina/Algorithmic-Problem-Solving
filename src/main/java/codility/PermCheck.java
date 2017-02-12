package codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] array) {
	Set<Integer> set = new HashSet<Integer>();
	for (int i = 0; i < array.length; i++) {
	    set.add(array[i]);
	}
	for (int i = 1; i <= array.length; i++) {
	    if (!set.contains(i)) {
		return 0;
	    }
	}
	return 1;
    }
}
