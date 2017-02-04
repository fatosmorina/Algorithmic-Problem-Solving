package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FindTheDifferenceTest {

    @InjectMocks
    FindTheDifference findTheDifference;

    @Test
    public void shouldReturnE() {
	assertEquals('e', findTheDifference.findTheDifference("abcd", "abcde"));
    }
    
    @Test
    public void shouldReturnD() {
	assertEquals('d', findTheDifference.findTheDifference("development", "evelopment"));
    }
}
