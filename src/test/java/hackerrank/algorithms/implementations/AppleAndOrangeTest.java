package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class AppleAndOrangeTest {
	
	@InjectMocks
	AppleAndOrange appleAndOrange;
	
	@Test
	public void shouldReturnAppleCounterEqualToOne(){
		int[] distances = {2, 1};
		assertEquals(appleAndOrange.getFruitCounter(7, 5, 11, distances), 1);
	}
	
	@Test
	public void shouldReturnOrangeCounterEqualToOne(){
		int[] distances = {-6};
		assertEquals(appleAndOrange.getFruitCounter(7, 15, 11, distances), 1);
	}

}
