package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddDigitsTest {
    @InjectMocks
    AddDigits addDigits;

    @Test
    public void shouldReturnThreeForFirstSolution() {
	assertEquals(addDigits.addDigits(3), 3);
    }

    @Test
    public void shouldReturnNineForFirstSolution() {
	assertEquals(addDigits.addDigits(18), 9);
    }

    @Test
    public void shouldReturnSixForFirstSolution() {
	assertEquals(addDigits.addDigits(10203), 6);
    }

    @Test
    public void shouldReturnThreeForSecondSolution() {
	assertEquals(addDigits.addDigitsWithLoops(3), 3);
    }

    @Test
    public void shouldReturnNineForSecondSolution() {
	assertEquals(addDigits.addDigitsWithLoops(18), 9);
    }

    @Test
    public void shouldReturnSixForSecondSolution() {
	assertEquals(addDigits.addDigitsWithLoops(10203), 6);
    }
}
