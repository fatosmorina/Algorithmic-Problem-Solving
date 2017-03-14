package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class PlusMinusTest {
    @InjectMocks
    PlusMinus plusMinus;

    @Test
    public void shouldReturnArray() {
        int[] array = { -4, 3, -9, 0, 4, 1 };
        double[] expectedResult = { 0.500000, 0.333333, 0.166667 };
        double[] actualResult = plusMinus.getArrayOfNumbers(array);
        assertArrayEquals(expectedResult, actualResult, 0.0003);
    }
}
