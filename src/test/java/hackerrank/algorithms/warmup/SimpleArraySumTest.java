package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SimpleArraySumTest {
    @InjectMocks
    SimpleArraySum simpleArraySum;

    @SuppressWarnings("static-access")
    @Test
    public void shouldReturnFive() {
        int[] array = { 3, 0, 1, 4, -3 };
        assertEquals(5, simpleArraySum.addArrayElements(array));
    }
}
