package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings("static-access")
@RunWith(MockitoJUnitRunner.class)
public class BreakingTheRecordTest {

	@InjectMocks
	BreakingTheRecord breakingTheRecord;

	@Test
	public void shouldReturnLowestAndHighest() {
		int[] array = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		int[] expectedValues = {2,4};
		assertArrayEquals(breakingTheRecord.getRecordsInfo(array), expectedValues);
	}
}
