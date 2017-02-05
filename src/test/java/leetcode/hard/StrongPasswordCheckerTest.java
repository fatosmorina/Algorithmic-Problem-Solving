package leetcode.hard;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StrongPasswordCheckerTest {

    @InjectMocks
    StrongPasswordChecker strongPasswordChecker;

    @Test
    public void shouldReturnZeroForStrongPassword() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("ab3CsOa"), 0);
    }

    @Test
    public void shouldReturnTwo() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("ABABABABABABABABABAB1"), 2);
    }

    @Test
    public void shouldReturnThree() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("Az3"), 3);
    }

    @Test
    public void shouldReturnFour() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("z3"), 4);
    }

    @Test
    public void shouldReturnFive() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("a"), 5);
    }

    @Test
    public void shouldReturnSix() {
	assertEquals(strongPasswordChecker.strongPasswordChecker(""), 6);
    }

    @Test
    public void shouldReturnSeven() {
	assertEquals(strongPasswordChecker.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaa"), 7);
    }

}
