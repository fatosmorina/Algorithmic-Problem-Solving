package hackerrank.algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class SolveMeFirstTest {
    @InjectMocks
    SolveMeFirst solveMeFirst;

    @Test
    public void shouldReturnSum() {
        assertEquals(5, solveMeFirst.addNumbers(3, 2));
    }
}
