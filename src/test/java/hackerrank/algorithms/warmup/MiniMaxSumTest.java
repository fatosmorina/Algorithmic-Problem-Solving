package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class MiniMaxSumTest {
    @InjectMocks
    MiniMaxSum miniMaxSum;

    @Test
    public void shouldReturnNumbers() {
        long[] expected = { 10, 14 };
        long[] array = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, miniMaxSum.getSums(array));
    }
}
