package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class CompareTheTripletsTest {
    @InjectMocks
    CompareTheTriplets compareTheTriplets;

    @Test
    public void shouldReturnOneAndOne() {
        int[] expectedResult = { 1, 1 };
        int[] a = { 5, 6, 7 };
        int[] b = { 3, 6, 10 };
        assertArrayEquals(expectedResult, compareTheTriplets.compareTheTriplets(a, b));
    }

}
