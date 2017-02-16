package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
	List<Integer> numbers = new ArrayList<Integer>();
	int counter = 0;
	for (Integer number : nums) {
	    if (number != 0) {
		numbers.add(number);
	    } else {
		counter++;
	    }
	}
	while (counter != 0) {
	    numbers.add(0);
	    counter--;
	}
	for (int i = 0; i < nums.length - 2; i++) {
	    if (nums[i] == 0) {
		int j = i + 1;
		while (nums[j] != 0 && j < nums.length) {
		    int temp = nums[j];
		    int next = nums[j + 1];
		    nums[j + 1] = temp;
		    nums[j] = next;
		    j++;
		}
	    }
	}
	return nums;
    }
}
