package codility;

public class RightShiftElement {

    public int[] solution(int[] array, int k) {
	int length = array.length;
	int[] shifted = new int[length];
	for (int i = 0; i < length; i++) {
	    shifted[(k + i) % length] = array[i];
	}
	return shifted;
    }
}
