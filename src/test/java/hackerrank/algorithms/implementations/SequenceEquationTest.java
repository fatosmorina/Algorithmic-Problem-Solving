package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("static-access")
public class SequenceEquationTest {

    @InjectMocks
    SequenceEquation sequenceEquation;

    @Test
    @SuppressWarnings("serial")
    public void shouldReturnTwo() {
        Map<Integer, Integer> input = new HashMap<Integer, Integer>() {
            {
                put(1, 2);
                put(2, 3);
                put(3, 1);
            }
        };
        Map<Integer, Integer> expectedOutput = new HashMap<Integer, Integer>() {
            {
                put(1, 3);
                put(2, 1);
                put(3, 2);
            }
        };
        Map<Integer, Integer> actualResult = sequenceEquation.getInverse(input);
        assertEquals(expectedOutput, actualResult);
    }
}
