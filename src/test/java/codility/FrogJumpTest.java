package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FrogJumpTest {
    @InjectMocks
    FrogJump frogJump;

    @Test
    public void shouldReturnThree() {
	int x = 10;
	int y = 85;
	int d = 30;
	assertEquals(3, frogJump.solution(x, y, d));
    }

}
