package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MissingNumberTest {
    @InjectMocks
    MissingNumber missingNumber;

    @Test
    public void shouldReturnOne() {
	int[] array = { 0 };
	assertEquals(1, missingNumber.missingNumber(array));
    }

    @Test
    public void shouldReturnTwo() {
	int[] array = { 0, 1, 3 };
	assertEquals(2, missingNumber.missingNumber(array));
    }
}
