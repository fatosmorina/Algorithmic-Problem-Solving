/**
 * For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
 * 
 * 1. The area of the rectangular web page you designed must equal to the given target area.
 * 
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 
 * 3. The difference between length L and width W should be as small as possible.
 * You need to output the length L and the width W of the web page you designed in sequence.
 * Example:
 * Input: 4
 * Output: [2, 2]
 * Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
 * But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
 * Note:
 * The given area won't exceed 10,000,000 and is a positive integer
 * The web page's width and length you designed must be positive integers.
 * Subscribe to see which companies asked this question.
 */

// https://leetcode.com/problems/construct-the-rectangle/

package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConstructRectangle {

    public int[] constructRectangle(int area) {
	int[] rectangle = { area, 1 };
	double squareRoot = Math.sqrt(area);
	int squareRootAsInt = (int) (squareRoot);
	if ((int) (Math.pow(squareRoot, 2)) == (int) Math.pow(squareRootAsInt, 2)) {
	    rectangle[0] = squareRootAsInt;
	    rectangle[1] = squareRootAsInt;
	    return rectangle;
	}
	List<Integer> factors = new ArrayList<Integer>();
	for (int i = 2; i < area; i++) {
	    if (area % i == 0) {
		factors.add(i);
	    }
	}
	Collections.sort(factors);
	int size = factors.size();
	if (size == 0) {
	    return rectangle;
	}
	if (size == 1) {
	    rectangle[0] = factors.get(0);
	    rectangle[1] = factors.get(0);
	}
	int minimum = Integer.MIN_VALUE;
	boolean firstTime = true;
	int length = 0;
	int width = 0;
	for (int i = factors.size() - 2; i > -1; i--) {
	    int currentLength = factors.get(i + 1);
	    int currentWidth = factors.get(i);
	    if (currentLength * currentWidth == area) {
		int currentMinimum = currentLength - currentWidth;
		if (firstTime) {
		    minimum = currentMinimum;
		    rectangle[0] = currentLength;
		    rectangle[1] = currentWidth;
		    firstTime = false;
		}
		if (!firstTime && minimum > currentMinimum) {
		    minimum = currentMinimum;
		    rectangle[0] = length;
		    rectangle[1] = width;
		}
	    }
	}
	return rectangle;
    }
}
