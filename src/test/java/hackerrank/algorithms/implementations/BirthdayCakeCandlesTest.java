package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import hackerrank.algorithms.warmup.BirthdayCakeCandles;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class BirthdayCakeCandlesTest {
	@InjectMocks
	BirthdayCakeCandles birthdayCakeCandles;

	@Test
	public void shouldReturnTwo() {
		int[] heights = { 3, 2, 1, 3 };
		assertEquals(2, birthdayCakeCandles.getMaxHeightCount(heights));
	}
}
