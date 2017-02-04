package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/construct-the-rectangle/
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
