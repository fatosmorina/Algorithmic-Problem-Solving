package codility;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] array) {
	Arrays.sort(array);
	for (int i = 0; i < array.length - 2; i++) {
	    if ((long) array[i] + (long) array[i + 1] > (long) array[i + 2]) {
		return 1;
	    }
	}
	return 0;
    }
}
