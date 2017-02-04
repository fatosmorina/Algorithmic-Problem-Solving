package leetcode.easy;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import leetcode.easy.FizzBuzz;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzTest {

    @InjectMocks
    FizzBuzz fizzBuzz;

    public final String FIZZ_BUZZ = "FizzBuzz";
    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";

    @Test
    public void shouldReturnFizz() {
	List<String> expectedResult = Arrays.asList("1", "2", FIZZ);
	List<String> actualResult = fizzBuzz.fizzBuzz(3);
	assertLists(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnBuzz() {
	List<String> expectedResult = Arrays.asList("1", "2", FIZZ, "4", BUZZ);
	List<String> actualResult = fizzBuzz.fizzBuzz(5);
	assertLists(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnFizzBuzz() {
	List<String> expectedResult = new ArrayList<String>();
	for (int i = 0; i < 15; i++) {
	    if (i == 2) {
		expectedResult.add(FIZZ);
	    } else if (i == 4) {
		expectedResult.add(BUZZ);
	    } else if (i == 14) {
		expectedResult.add(FIZZ_BUZZ);
	    } else {
		expectedResult.add((i + 1) + "");
	    }
	}
	List<String> actualResult = fizzBuzz.fizzBuzz(15);
	assertLists(expectedResult, actualResult);
    }

    private void assertLists(List<String> expectedResult, List<String> actualResult) {
	int expectedLength = expectedResult.size();
	int resultLength = actualResult.size();
	assertEquals(expectedLength, resultLength);
	for (int i = 0; i < expectedLength; i++) {
	    assertEquals(expectedResult.get(0), actualResult.get(0));
	}
    }
}
