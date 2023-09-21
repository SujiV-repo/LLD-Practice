package Graphs;

public class Solution {
    int[] x = {1, -1, 0, 0};
    int[] y = {0, 0, -1, 1};
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    isIsland(i, j, grid, grid.length, grid[0].length);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void isIsland(int i, int j, char[][] grid, int m, int n){
        grid[i][j] = '2';

        for(int k = 0; k < 4; k++){
            int row = x[k] + i;
            int col = x[k] + j;

            if(isValid(row, col, m, n) && grid[row][col] == '1'){
                isIsland(row, col, grid, m, n);
            }
        }
    }


    public boolean isValid(int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n){
            return false;
        }

        return true;
    }
}
