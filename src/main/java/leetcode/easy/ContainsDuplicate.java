package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
	Set<Integer> set = new HashSet<Integer>();
	for (int i = 0; i < nums.length; i++) {
	    if (!set.add(nums[i])) {
		return true;
	    }
	}
	return false;
    }
}
