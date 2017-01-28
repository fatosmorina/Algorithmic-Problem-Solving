package leetcode;

public class AddDigits {

    public int addDigits(int number) {
	if (number == 0) {
	    return 0;
	}
	if (number % 9 == 0) {
	    return 9;
	}
	return number % 9;
    }

    //second solution
    public int addDigitsWithLoops(int number) {
	int sum = 0;
	while (number != 0) {
	    sum = sum + number % 10;
	    number = number / 10;
	}
	int finalSum = 0;
	while (sum != 0) {
	    finalSum = finalSum + sum % 10;
	    sum = sum / 10;
	}
	return finalSum;
    }
}
