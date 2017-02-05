package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public int majorityElement(int[] nums) {
	int length = nums.length;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < length; i++) {
	    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	}
	int answer = -1;
	int frequency = 0;
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    int value = entry.getValue();
	    int key = entry.getKey();
	    if (frequency < value) {
		answer = key;
		frequency = value;
	    }
	}
	return answer;
    }
}
