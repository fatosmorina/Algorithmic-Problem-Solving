package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TriangleTest {
    @InjectMocks
    Triangle triangle;

    @Test
    public void shouldReturnOneFirst() {
	int[] array = { 10, 2, 5, 1, 8, 20 };
	assertEquals(1, triangle.solution(array));
    }

    @Test
    public void shouldReturnOneSecond() {
	int[] array = { 5, 3, 3 };
	assertEquals(1, triangle.solution(array));
    }

    @Test
    public void shouldReturnZero() {
	int[] array = { 1, 5, 10, 50 };
	assertEquals(0, triangle.solution(array));
    }
}
