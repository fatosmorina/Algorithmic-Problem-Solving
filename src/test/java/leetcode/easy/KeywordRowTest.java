package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class KeywordRowTest {
    @InjectMocks
    KeywordRow keywordRow;

    @Test
    public void shouldReturnElements() {
	String[] words = { "Hello", "Alaska", "Dad", "Peace" };
	String[] expectedResult = { "Alaska", "Dad" };
	String[] actualResult = keywordRow.findWords(words);
	assertEquals(expectedResult, actualResult);
    }
}
