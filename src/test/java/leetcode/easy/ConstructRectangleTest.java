package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ConstructRectangleTest {
    @InjectMocks
    ConstructRectangle constructRectangle;

    @Test
    public void shouldReturnDimensionsForFour() {
	int[] actualResult = constructRectangle.constructRectangle(4);
	int[] expectedResult = { 2, 2 };
	assertEquals(actualResult[0], expectedResult[0]);
	assertEquals(actualResult[1], expectedResult[1]);
    }

    @Test
    public void shouldReturnDimensionsForSix() {
	int[] actualResult = constructRectangle.constructRectangle(6);
	int[] expectedResult = { 3, 2 };
	assertEquals(actualResult[0], expectedResult[0]);
	assertEquals(actualResult[1], expectedResult[1]);
    }
}
