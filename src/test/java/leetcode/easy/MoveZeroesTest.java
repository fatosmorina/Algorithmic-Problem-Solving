package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MoveZeroesTest {
    @InjectMocks
    MoveZeroes moveZeroes;

    @Test
    public void shouldReturnArray() {
	int[] array = { 1, 0, 3, 0, 2, 4 };
	int[] changedArray = { 1, 3, 2, 4, 0, 0 };
	assertEquals(changedArray, moveZeroes.moveZeroes(array));

    }
}
