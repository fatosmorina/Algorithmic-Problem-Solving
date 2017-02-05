package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberOf1BitsTest {
    @InjectMocks
    NumberOf1Bits numberOf1Bits;

    @Test
    public void shouldReturnTwoForFirstSolution() {
	assertEquals(numberOf1Bits.hammingWeight(9), 2);
    }

    @Test
    public void shouldReturnSixForFirstSolution() {
	assertEquals(numberOf1Bits.hammingWeight(63), 6);
    }

    @Test
    public void shouldReturnTwoForSecondSolution() {
	assertEquals(numberOf1Bits.hammingWeight2(9), 2);
    }

    @Test
    public void shouldReturnSixForSecondSolution() {
	assertEquals(numberOf1Bits.hammingWeight2(63), 6);
    }
}
