package leetcode.easy;

public class SingleNumber {
    /// https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
	int result = 0;
	for (int number : nums) {
	    result ^= number;
	}
	return result;
    }

}
