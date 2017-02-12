package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RightShiftElementTest {

    @InjectMocks
    RightShiftElement rightShiftElement;

    @Test
    public void shouldReturnRightShiftedArray() {
	int[] array = { 1, 2, 3, 4, 5 };
	int k = 1;
	int[] shifted = { 5, 1, 2, 3, 4 };
	int[] result = rightShiftElement.solution(array, k);
	for (int i = 0; i < array.length; i++) {
	    assertEquals(shifted[i], result[i]);
	}
    }
}
