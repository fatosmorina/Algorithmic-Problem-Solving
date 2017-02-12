package codility;

public class RightShiftElement {

    public int[] solution(int[] array, int k) {
	int[] shifted = new int[array.length];
	for (int i = 0; i < array.length; i++) {
	    shifted[(k + i) % array.length] = array[i];
	}
	return shifted;
    }
}
