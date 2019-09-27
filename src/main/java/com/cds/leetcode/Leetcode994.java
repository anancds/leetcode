package com.cds.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by cds on 2019-09-24 00:27.
 */
public class Leetcode994 {

  final static int[][] steps = {{0,1},{0,-1}, {1,0},{-1,0}};

  public static void bfs(int x, int y, int m, int n ,int[][] grid, int[][] map) {
    Deque<int[]> deque = new ArrayDeque<>();
    deque.addLast(new int[]{x,y});
    while (!deque.isEmpty()) {
        int[] temp  = deque.peekFirst();
        grid[temp[0]][temp[1]] = 2;
        map[x][y] = 1;


        for (int[] s : steps) {
          deque.addLast(new int[] { x + s[0], y + s[1]});
        }
    }
  }
  public int orangesRotting(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;


    return 0;
  }

  public static void main(String[] args) {

  }

}
