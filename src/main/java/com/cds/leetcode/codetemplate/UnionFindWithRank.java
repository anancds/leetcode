package com.cds.leetcode.codetemplate;

/**
 * Created by cds on 2019-10-13 11:54.
 */
public class UnionFindWithRank {

  int count;

  int[] parents, rank;

  public UnionFindWithRank(int n) {
    parents = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; i++) {
      parents[i] = i;

      count = n;
    }
  }

  public int find(int p) {
    while (p != parents[p]) {
      parents[p] = parents[parents[p]];    // path compression by halving
      p = parents[p];
    }
    return p;
  }

  public void union(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    if (rootP == rootQ) return;
    if (rank[rootQ] > rank[rootP]) {
      parents[rootP] = rootQ;
    }
    else {
      parents[rootQ] = rootP;
      if (rank[rootP] == rank[rootQ]) {
        rank[rootP]++;
      }
    }
    count--;
  }

  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }


  public static void main(String[] args) {
    UnionFindWithRank unionFindWithRank = new UnionFindWithRank(10);
    unionFindWithRank.union(2, 1);
    unionFindWithRank.union(3, 2);
    unionFindWithRank.union(1, 3);

    unionFindWithRank.union(6, 5);
    unionFindWithRank.union(7, 6);
    unionFindWithRank.union(5, 7);

    unionFindWithRank.union(1, 6);
    unionFindWithRank.union(1, 7);
    unionFindWithRank.union(1, 5);
    System.out.println(unionFindWithRank.connected(1, 4));
  }

}
