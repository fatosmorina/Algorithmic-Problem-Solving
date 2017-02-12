package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FrogRiverOneTest {

    @InjectMocks
    FrogRiverOne frogRiverOne;

    @Test
    public void shouldReturnSix() {
	int[] array = { 1, 3, 1, 4, 2, 3, 5, 4 };
	int x = 5;
	assertEquals(6, frogRiverOne.solution(x, array));
    }
}
