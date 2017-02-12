package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TapeEquilibriumTest {
    @InjectMocks
    TapeEquilibrium tapeEquilibrium;

    @Test
    public void shouldReturnOne() {
	int[] array = { 3, 1, 2, 4, 3 };
	assertEquals(1, tapeEquilibrium.solution(array));
    }
}
