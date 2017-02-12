package codility;

public class PermMissingElem {
    public int solution(int[] array) {
	int length = array.length;
	long desiredSum = (length + 1l) * (length + 2) / 2;
	int actualSum = 0;
	for (int i = 0; i < length; i++) {
	    actualSum = actualSum + array[i];
	}
	return (int) (desiredSum - actualSum);
    }
}
