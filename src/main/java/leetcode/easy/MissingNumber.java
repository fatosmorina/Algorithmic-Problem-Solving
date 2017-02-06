package leetcode.easy;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public int missingNumber(int[] nums) {
	int sum = 0;
	int length = nums.length;
	for (int i = 0; i < length; i++) {
	    sum = sum + nums[i];
	}
	return length * (length + 1) / 2 - sum;
    }
}
