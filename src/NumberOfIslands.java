package iCoding;

/**
 * https://leetcode.com/problems/number-of-islands/ (200. Number of Islands)
 * @author carrieli
 *
 */

public class NumberOfIslands {
	public static void main(String[] args) {
		int[][] grid = {
			{1,1,0,0,1},
			{1,1,1,0,0},
			{0,0,1,0,1},
			{0,0,1,1,1}
		};
		int islands = 0;
		if(grid.length == 0){
			System.out.println("0");
			System.exit(0);
		}
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[i].length; j++){
				if(grid[i][j] == 1){
					islands++;
					DFS(grid, i, j);
				}
			}
		}
		System.out.println(islands);
	}
	
	public static void DFS(int[][] grid, int i, int j){
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		grid[i][j] = 2;
		for(int k=0; k<4; k++){
			if(i+dx[k]>=0 && i+dx[k]<grid.length && j+dy[k]>=0 && j+dy[k]<grid[i].length && grid[i+dx[k]][j+dy[k]]==1)
				DFS(grid, i+dx[k], j+dy[k]);
		}
	}
}

