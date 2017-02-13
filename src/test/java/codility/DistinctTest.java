package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DistinctTest {
    @InjectMocks
    Distinct distinct;

    @Test
    public void shouldReturnThree() {
	int[] array = { 1, 2, 3 };
	assertEquals(3, distinct.solution(array));
    }

    @Test
    public void shouldReturnSix() {
	int[] array = { 1, 2, 3, 3, 4, 5, 6, 6 };
	assertEquals(6, distinct.solution(array));
    }
}
