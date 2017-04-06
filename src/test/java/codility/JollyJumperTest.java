package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import uva.JollyJumper;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class JollyJumperTest {

	@InjectMocks
	JollyJumper jollyJumper;

	@Test
	public void shouldReturnMaximalElement() {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		assertEquals(jollyJumper.findMaximalElement(numbers), 6);
	}

}
