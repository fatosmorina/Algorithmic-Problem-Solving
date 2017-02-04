package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IntersectionOfTwoArraysTest {
    @InjectMocks
    IntersectionOfTwoArrays intersectionOfTwoArrays;

    @Test
    public void shouldReturnIntersection() {
	int[] nums1 = { 1, 2, 3, 4, 5 };
	int[] nums2 = { 1, 2, 3, 53, 38, -3 };
	int[] expectedResult = { 1, 2, 3 };
	int[] actualResult = intersectionOfTwoArrays.intersection(nums1, nums2);
	assertEquals(expectedResult.length, actualResult.length);
	for (int i = 0; i < expectedResult.length; i++) {
	    assertEquals(expectedResult[i], actualResult[i]);
	}
    }
}
