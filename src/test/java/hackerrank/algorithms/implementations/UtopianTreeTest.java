package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UtopianTreeTest {

    @InjectMocks
    UtopianTree utopianTree;

    @Test
    public void shouldReturnOne() {
	assertEquals(1, utopianTree.solution(0));
    }

    @Test
    public void shouldReturnTwo() {
	assertEquals(2, utopianTree.solution(1));
    }

    @Test
    public void shouldReturnSeven() {
	assertEquals(7, utopianTree.solution(4));
    }

}
