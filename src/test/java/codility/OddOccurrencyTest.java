package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class OddOccurrencyTest {
    @InjectMocks
    OddOccurrency oddOccurrency;

    @Test
    public void shouldReturnSeven() {
	int[] A = { 9, 3, 9, 3, 9, 7, 9 };
	assertEquals(7, oddOccurrency.solution(A));
    }
}
