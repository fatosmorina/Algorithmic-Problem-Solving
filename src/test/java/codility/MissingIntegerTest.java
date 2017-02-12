package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MissingIntegerTest {
    @InjectMocks
    MissingInteger missingInteger;

    @Test
    public void shouldReturnFour() {
	int[] array = { 3, 8, 12 };
	assertEquals(4, missingInteger.solution(array));
    }

    @Test
    public void shouldReturnFive() {
	int[] array = { 1, 3, 6, 4, 1, 2 };
	assertEquals(5, missingInteger.solution(array));
    }
}
