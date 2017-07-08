/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */

//https://leetcode.com/problems/contains-duplicate/
package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

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
