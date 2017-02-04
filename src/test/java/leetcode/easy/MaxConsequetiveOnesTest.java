package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaxConsequetiveOnesTest {

    @InjectMocks
    MaxConsequetiveOnes maxConsequetiveOnes;

    @Test
    public void shouldReturnThree() {
	int[] numbers = { 1, 1, 0, 1, 1, 1 };
	assertEquals(3, maxConsequetiveOnes.findMaxConsecutiveOnes(numbers));
    }

    @Test
    public void shouldReturnOne() {
	int[] numbers = { 1, 0, 0, 0 };
	assertEquals(1, maxConsequetiveOnes.findMaxConsecutiveOnes(numbers));
    }

    @Test
    public void shouldReturnZero() {
	int[] numbers = { 0, 0, 0 };
	assertEquals(0, maxConsequetiveOnes.findMaxConsecutiveOnes(numbers));
    }

}
