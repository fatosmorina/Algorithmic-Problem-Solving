package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LongestCommonPrefixTest {
    @InjectMocks
    LongestCommonPrefix longestCommonPrefix;

    @Test
    public void shouldReturnAbcd() {
	String[] strings = { "abcdAre you okay?", "abcd Is everything fine?", "abcd Did you hear that sound?" };
	String actualResult = longestCommonPrefix.longestCommonPrefix(strings);
	assertEquals("abcd", actualResult);
    }
    
    @Test
    public void shouldReturnEmptyString() {
	String[] strings = { "Are you okay?", "Is everything fine?", "Did you hear that sound?" };
	String actualResult = longestCommonPrefix.longestCommonPrefix(strings);
	assertEquals("", actualResult);
    }
}