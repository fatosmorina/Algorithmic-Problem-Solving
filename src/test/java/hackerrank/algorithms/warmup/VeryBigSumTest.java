package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class VeryBigSumTest {

    @InjectMocks
    VeryBigSum veryBigSum;

    @Test
    public void shouldReturnBigSum() {
        int[] array = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
        assertEquals(5000000015l, veryBigSum.getSumOfArrayElements(array));
    }
}
