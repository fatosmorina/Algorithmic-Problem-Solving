package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class CutTheSticksTest {

    @InjectMocks
    CutTheSticks cutTheSticks;

    @Test
    public void shouldReturnSequence() {
	String expected = "3\n2\n1";
	int[] array = { 3, 2, 1 };
	assertEquals(expected, cutTheSticks.cutTheSticks(array));
    }

    @Test
    public void shouldReturnSequence2() {
	String expected = "6\n4\n2\n1";
	int[] array = { 5, 4, 4, 2, 2, 8 };
	assertEquals(expected, cutTheSticks.cutTheSticks(array));
    }

}
