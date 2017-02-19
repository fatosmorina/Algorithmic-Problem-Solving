package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class FindDigitsTest {

    @InjectMocks
    FindDigits findDigits;

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, findDigits.findDigits(12));
    }

    @Test
    public void shouldReturnThree() {
	assertEquals(3, findDigits.findDigits(1012));
    }
}
