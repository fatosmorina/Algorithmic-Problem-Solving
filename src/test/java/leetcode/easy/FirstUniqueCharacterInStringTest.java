package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FirstUniqueCharacterInStringTest {
    @InjectMocks
    FirstUniqueCharacterInString firstUniqueCharacterInString;

    @Test
    public void shouldReturnZero() {
	assertEquals(0, firstUniqueCharacterInString.firstUniqChar("abcd"));
    }
    
    @Test
    public void shouldReturnOne() {
	assertEquals(1, firstUniqueCharacterInString.firstUniqChar("abcad"));
    }
}
