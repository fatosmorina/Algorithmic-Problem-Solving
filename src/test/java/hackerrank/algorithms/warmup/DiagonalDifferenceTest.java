package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class DiagonalDifferenceTest {
    @InjectMocks
    DiagonalDifference diagonalDifference;

    @Test
    public void shouldReturn15() {
        int[][] matrix = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
        assertEquals(15, diagonalDifference.findDifferenceOfDiagonals(matrix));
    }
}
