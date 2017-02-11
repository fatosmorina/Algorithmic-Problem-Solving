package codility;

public class OddOccurrency {

    public int solution(int[] A) {
	int unpairedNumber = 0;
	for (int number : A) {
		unpairedNumber ^= number;
	}
	return unpairedNumber;
    }
}
