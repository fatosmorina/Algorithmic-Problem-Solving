package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
	List<String> list = new ArrayList<String>();
	for (int i = 1; i < n + 1; i++) {
	    if (i % 15 == 0) {
		list.add("FizzBuzz");
	    } else if (i % 3 == 0) {
		list.add("Fizz");
	    } else if (i % 5 == 0) {
		list.add("Buzz");
	    } else {
		list.add(i + "");
	    }
	}
	return list;
    }

}
