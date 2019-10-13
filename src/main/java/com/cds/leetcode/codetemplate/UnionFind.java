package com.cds.leetcode.codetemplate;

/**
 * Created by cds on 2019-10-13 11:54.
 */
public class UnionFind {

  int count;

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
    int rootp = find(p);
    int rootq = find(q);
    if (rootp == rootq) {
      return;
    }
    parents[rootq] = rootp;
    count--;
  }

  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }


  public static void main(String[] args) {
    UnionFind unionFind = new UnionFind(5);
    unionFind.union(2, 1);
    unionFind.union(3, 2);
    unionFind.union(1, 3);
    System.out.println(unionFind.connected(1, 3));
  }

}
