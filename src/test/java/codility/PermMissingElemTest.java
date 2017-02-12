package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class PermMissingElemTest {

    @InjectMocks
    PermMissingElem permMissingElem;

    @Test
    public void shouldReturnFour() {
	int[] array = { 2, 3, 1, 5 };
	assertEquals(4, permMissingElem.solution(array));
    }

    @Test
    public void shouldReturnOne() {
	int length = 100001;
	int[] array = new int[length];
	for (int i = 0; i < length; i++) {
	    array[i] = (i + 1);
	}
	assertEquals(length + 1, permMissingElem.solution(array));
    }
}
