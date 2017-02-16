package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaxProductOfThreeTest {
    @InjectMocks
    MaxProductOfThree maxProductOfThree;

    @Test
    public void shouldReturn60() {
	int[] array = { -3, 1, 2, -2, 5, 6 };
	assertEquals(60, maxProductOfThree.solution(array));
    }

    @Test
    public void shouldReturn120() {
	int[] array = { -5, 5, -5, 4 };
	assertEquals(120, maxProductOfThree.solution(array));

    }
}
