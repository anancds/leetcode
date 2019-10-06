package com.cds.leetcode.backup;

/**
 * Created by cds on 2019-09-22 17:32.
 */
public class Leetcode778 {

  final static int[][] steps = {{0,1},{0,-1}, {1,0},{-1,0}};

  public static void dfs(int t, int x, int y, int n, int[][] grid, int[][] visited) {
    if (x < 0 || y < 0 || x >= n || y >= n   || (grid[x][y] > t) || visited[x][y] == 1) {
      return;
    }

    visited[x][y] = 1;

    for (int[] s : steps) {

      dfs(t, x + s[0], y + s[1], n ,grid, visited);
    }
  }

  public static int swimInWater(int[][] grid) {

    int t = 0;
    int n = grid.length;
    int[][] visited = new int[n][n];

    while (visited[n -1][n - 1] == 0) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n;j++) {
          visited[i][j] = 0;
        }
      }
      dfs(t, 0, 0, n, grid, visited);
      t++;
    }

    return t -1;
  }

  public static void main(String[] args) {
    int[][] input = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
    System.out.println(swimInWater(input));
  }

}
