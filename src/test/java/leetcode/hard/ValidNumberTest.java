package leetcode.hard;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ValidNumberTest {
    @InjectMocks
    ValidNumber validNumber;

    @Test
    public void shouldReturnFalseForInvalidNumber1() {
	assertFalse(validNumber.isNumber("a0"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber2() {
	assertFalse(validNumber.isNumber("- "));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber3() {
	assertFalse(validNumber.isNumber("1 a"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber4() {
	assertFalse(validNumber.isNumber("."));
	assertFalse(validNumber.isNumber(","));
	assertFalse(validNumber.isNumber(";"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber5() {
	assertFalse(validNumber.isNumber("..23"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber6() {
	assertFalse(validNumber.isNumber(".e1"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber7() {
	assertFalse(validNumber.isNumber("1e."));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber8() {
	assertFalse(validNumber.isNumber(" -."));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber9() {
	assertFalse(validNumber.isNumber("6e6.5"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber10() {
	assertFalse(validNumber.isNumber("6ee39"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber11() {
	assertFalse(validNumber.isNumber(" 4e3."));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber12() {
	assertFalse(validNumber.isNumber("959440.94f"));
    }

    @Test
    public void shouldReturnFalseForInvalidNumber13() {
	assertFalse(validNumber.isNumber("84656e656D"));
    }

    @Test
    public void shouldReturnTrueForValidNumber() {
	assertTrue(validNumber.isNumber("0"));
    }

    @Test
    public void shouldReturnTrueForValidNumber2() {
	assertTrue(validNumber.isNumber(" 0.1 "));
    }

    @Test
    public void shouldReturnTrueForValidNumber3() {
	assertTrue(validNumber.isNumber("2e10"));
    }

    @Test
    public void shouldReturnTrueForValidNumber4() {
	assertTrue(validNumber.isNumber("-44.31"));
    }

    @Test
    public void shouldReturnTrueForValidNumber5() {
	assertTrue(validNumber.isNumber("3."));
    }

    @Test
    public void shouldReturnTrueForValidNumber6() {
	assertTrue(validNumber.isNumber(".1"));
    }

    @Test
    public void shouldReturnTrueForValidNumber7() {
	assertTrue(validNumber.isNumber("46.e3"));
    }

}
