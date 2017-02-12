package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class PermCheckTest {
    @InjectMocks
    PermCheck permCheck;

    @Test
    public void shouldReturnOne() {
	int[] array = { 1, 2, 3 };
	assertEquals(1, permCheck.solution(array));
    }

    @Test
    public void shouldReturnZero() {
	int[] array = { 1, 2, 4 };
	assertEquals(0, permCheck.solution(array));
    }

    @Test
    public void shouldReturnZero2() {
	int[] array = { 1, 2, 3, 5 };
	assertEquals(0, permCheck.solution(array));
    }
}
