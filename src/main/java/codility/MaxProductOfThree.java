package codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] array) {
	Arrays.sort(array);
	int length = array.length;
	return Math.max(array[length - 3] * array[length - 2] * array[length - 1],
		array[0] * array[1] * array[length - 1]);
    }
}
