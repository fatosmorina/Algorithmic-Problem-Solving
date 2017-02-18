package hackerrank.algorithms.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BetweenTwoSetsTest {

    @InjectMocks
    BetweenTwoSets betweenTwoSets;

    @Test
    public void shouldReturnOne() {
	int[] A = { 2 };
	int[] B = { 20, 30, 12 };
	assertEquals(1, betweenTwoSets.solution(A, B));
    }

    @Test
    public void shouldReturnThree() {
	int[] A = { 2, 4 };
	int[] B = { 16, 32, 64 };
	assertEquals(3, betweenTwoSets.solution(A, B));
    }

    @Test
    public void shouldReturnNine() {
	int[] A = { 1 };
	int[] B = { 100 };
	assertEquals(9, betweenTwoSets.solution(A, B));
    }

    @Test
    public void shouldReturnEight() {
	int[] A = { 1 };
	int[] B = { 72, 48 };
	assertEquals(8, betweenTwoSets.solution(A, B));
    }

}
