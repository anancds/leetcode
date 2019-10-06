package com.cds.leetcode.backup;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cds on 2/10/16.
 */
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String temp = "(" + board[i][j] + ")";
                    if (!set.add(i + temp) || !set.add(temp + j) || !set.add(i / 3 + temp + j / 3)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
