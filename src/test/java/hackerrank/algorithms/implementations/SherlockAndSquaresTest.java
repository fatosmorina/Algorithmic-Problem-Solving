package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class SherlockAndSquaresTest {
    @InjectMocks
    SherlockAndSquares sherlockAndSquares;

    @Test
    public void shouldReturnZero() {
	assertEquals(0, sherlockAndSquares.countNumber(17, 24));
    }

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, sherlockAndSquares.countNumber(3, 9));
    }

}
