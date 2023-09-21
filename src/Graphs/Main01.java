package Graphs;

public class Main01 {

    public static void main(String[] args) {
        char[][] grid = {{1,1,1,1,0}, {1,1,0,1,0}, {1,1,0,0,0}, {0,0,0,0,0}};

        Solution sol = new Solution();
        int ans = sol.numIslands(grid);
    }

}
