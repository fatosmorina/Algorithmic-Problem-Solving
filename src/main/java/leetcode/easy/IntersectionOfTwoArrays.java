package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
	Set<Integer> secondArrayList = new HashSet<Integer>();
	Set<Integer> result = new HashSet<Integer>();
	for (int i = 0; i < nums2.length; i++) {
	    secondArrayList.add(nums2[i]);
	}
	for (int i = 0; i < nums1.length; i++) {
	    if (secondArrayList.contains(nums1[i])) {
		result.add(nums1[i]);
	    }
	}
	int[] arrayResult = new int[result.size()];
	int i = 0;
	for (Integer val : result)
	    arrayResult[i++] = val;
	return arrayResult;
    }
}
