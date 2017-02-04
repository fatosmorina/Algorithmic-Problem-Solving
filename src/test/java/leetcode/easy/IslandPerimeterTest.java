package leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IslandPerimeterTest {

    @InjectMocks
    IslandPerimeter islandPerimeter;

    @Test
    public void shouldReturnSixteen() {
	int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
	assertEquals(16, islandPerimeter.islandPerimeter(grid));
    }

   @Test
    public void shouldReturnOne() {
	int[][] grid = { { 1 }, { 0 } };
	assertEquals(4, islandPerimeter.islandPerimeter(grid));
    }

    @Test
    public void shouldReturnEight() {
	int[][] grid = { { 1, 1 }, { 1, 1 } };
	assertEquals(8, islandPerimeter.islandPerimeter(grid));
    }
}
