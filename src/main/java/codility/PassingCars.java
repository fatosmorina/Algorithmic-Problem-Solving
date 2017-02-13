package codility;

public class PassingCars {

    public int solution(int[] array) {
	long counter = 0;
	boolean foundZero = false;
	long countNumberOfZeros = 0;
	for (int i = 0; i < array.length; i++) {
	    if (array[i] == 0) {
		foundZero = true;
		countNumberOfZeros++;
		continue;
	    }
	    if (foundZero) {
		if (array[i] == 1) {
		    counter = counter + countNumberOfZeros;
		}
	    }
	    if (array[i] == 0) {
		countNumberOfZeros++;
		foundZero = false;
	    }
	}
	if (counter > 1000000000) {
	    return -1;
	}
	return (int) counter;
    }
}
