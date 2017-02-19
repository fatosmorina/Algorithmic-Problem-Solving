package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UtopianTreeTest {

    @InjectMocks
    UtopianTree utopianTree;

    @Test
    public void shouldReturnArray() {
	int[] testCases = { 0, 1, 4 };
	int[] expectedResult = { 1, 2, 7 };
	int expectedLength = expectedResult.length;
	int[] actualResult = utopianTree.solution(testCases);
	assertEquals(expectedLength, actualResult.length);
	for (int i = 0; i < expectedLength; i++) {
	    assertEquals(expectedResult[i], actualResult[i]);
	}
    }

}
