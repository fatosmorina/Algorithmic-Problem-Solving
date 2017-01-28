package leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	for (int i = 0; i < nums.length; i++) {
	    int difference = target - nums[i];
	    if (map.containsKey(difference)) {
		return new int[] { target, difference };
	    }
	    map.put(nums[i], i);
	}
	return null;
    }
}
