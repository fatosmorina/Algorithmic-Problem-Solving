package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class HurdleRaceTest {
    @InjectMocks
    HurdleRace hurdleRace;

    @Test
    public void shouldReturnTwo() {
        int[] heights = { 1, 6, 3, 5, 2 };
        assertEquals(2, hurdleRace.getMinimalNumberOfBeverages(4, heights));

    }

    @Test
    public void shouldReturnZero() {
        int[] heights = { 2, 5, 4, 5, 2 };
        assertEquals(0, hurdleRace.getMinimalNumberOfBeverages(7, heights));

    }
}
