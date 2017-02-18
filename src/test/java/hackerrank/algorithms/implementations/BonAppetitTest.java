package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BonAppetitTest {

    @InjectMocks
    BonAppetit bonAppetit;

    @Test
    public void shouldReturnFive() {
	int[] array = { 3, 10, 2, 9 };
	assertEquals("5", bonAppetit.solution(4, 1, array, 12));
    }
}
