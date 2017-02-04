package leetcode.easy;

//https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

	int numberOfIslands = 0;
	int numberOfNeighbors = 0;

	for (int i = 0; i < grid.length; i++) {
	    for (int j = 0; j < grid[i].length; j++) {
		if (grid[i][j] == 1) {
		    numberOfIslands++;
		    if (i < grid.length - 1 && grid[i + 1][j] == 1)
			numberOfNeighbors++;
		    if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
			numberOfNeighbors++;
		}
	    }
	}
	return numberOfIslands * 4 - numberOfNeighbors * 2;
    }
}
