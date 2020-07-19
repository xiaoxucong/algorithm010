package com.algorithm.ok.week_6;

/***
 * 64. 最小路径和
 */
public class Minnum {

    public int minPathSum(int[][] grid) {


        return test(grid,0,0);

    }
    //递归

    /***
     * 复杂度分析
     *
     * 时间复杂度 ：O(2^{m+n})。每次移动最多可以有两种选择。
     * 空间复杂度 ：O(m+n)。递归的深度是 m+n。
     * @param grid
     * @param i
     * @param j
     * @return
     */
    private int test(int[][] grid,int i,int j) {
        if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        return grid[i][j] + Math.min(test(grid, i + 1, j), test(grid, i, j + 1));
    }

    /***
     * 动态规划（不需要额外存储空间）
     * @param grid
     * @return
     */
    public int minPathSum_1(int[][] grid) {
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(i == grid.length - 1 && j != grid[0].length - 1)
                    grid[i][j] = grid[i][j] +  grid[i][j + 1];
                else if(j == grid[0].length - 1 && i != grid.length - 1)
                    grid[i][j] = grid[i][j] + grid[i + 1][j];
                else if(j != grid[0].length - 1 && i != grid.length - 1)
                    grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j],grid[i][j + 1]);
            }
        }
        return grid[0][0];
    }

}
