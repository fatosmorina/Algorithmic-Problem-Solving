package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class RepeatedStringTest {

    @InjectMocks
    RepeatedString repeatedString;

    @Test
    public void shouldReturnSeven() {
	assertEquals(7, repeatedString.getNthLetter("aba", 10));
    }

    @Test
    public void shouldReturnLargeNumber() {
	assertEquals(1000000000000l, repeatedString.getNthLetter("a", 1000000000000l));
    }
}
