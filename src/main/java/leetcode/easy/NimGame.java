package leetcode.easy;

public class NimGame {

    public boolean canWinNim(int n) {
	if (n > 0 && n < 4) {
	    return true;
	}
	if (n % 2 == 1) {
	    return true;
	}
	if (n % 2 == 0 && (n / 2 % 2 == 1)) {
	    return true;
	}
	return false;
    }
}
