package com.cds.leetcode.unionfind;

/**
 * Created by cds on 2019-10-13 12:19.
 */
public class Leetcode547 {

  public class UnionFind {

    private int count;

    int[] parents;

    public UnionFind(int n) {
      parents = new int[n];
      for (int i = 0; i < n; i++) {
        parents[i] = i;

        count = n;
      }
    }

    public int find(int p) {
      while (parents[p] != p) {
        p = parents[p];
      }

      return p;
    }

    public void union(int p, int q) {
      int tempP = find(p);
      int tempQ = find(q);
      if (tempP == tempQ) {
        return;
      }
      parents[tempP] = tempQ;
      count--;
    }

    public boolean connected(int p, int q) {
      return find(p) == find(q);
    }

    public int getCount() {
      return count;
    }
  }

  public int findCircleNum(int[][] M) {
    if (M == null || M.length == 0) {
      return 0;
    }

    int m = M.length;

    int n = M[0].length;

    UnionFind unionFind = new UnionFind(m);


    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (M[i][j] == 1) {
          unionFind.union(i, j);
        }
      }
    }

    return unionFind.getCount();
  }

  public static void main(String[] args) {
    int[][] input = {{1,1,0}, {1,1,0}, {0,0,1}};
    System.out.println(new Leetcode547().findCircleNum(input));
  }

}
