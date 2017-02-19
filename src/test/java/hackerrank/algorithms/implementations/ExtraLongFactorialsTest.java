package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class ExtraLongFactorialsTest {
    @InjectMocks
    ExtraLongFactorials extraLongFactorials;

    @Test
    public void shouldReturn() {
	assertEquals(new BigInteger("15511210043330985984000000"), extraLongFactorials.calculateFactorial(25));
    }
}
