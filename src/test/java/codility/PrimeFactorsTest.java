package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import uva.PrimeFactors;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class PrimeFactorsTest {

	@InjectMocks
	PrimeFactors primeFactors;

	@Test
	public void shouldReturnPrimeFactorsOf190() {
		assertEquals(primeFactors.getPrimeFactors(190), Arrays.asList(2, 5, 19));
	}

}
