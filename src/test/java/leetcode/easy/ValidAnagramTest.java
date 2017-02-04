package leetcode.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ValidAnagramTest {

    @InjectMocks
    ValidAnagram validAnagram;

    @Test
    public void shouldReturnTrue() {
	String s = "anagram", t = "nagaram";
	assertTrue(validAnagram.isAnagram(s, t));
    }
    
    @Test
    public void shouldReturnFalse() {
	String s = "book", t = "bicycle";
	assertFalse(validAnagram.isAnagram(s, t));
    }
    
    @Test
    public void shouldReturnFalseForOneLetter() {
	String s = "aa", t = "bb";
	assertFalse(validAnagram.isAnagram(s, t));
    }
}
