package com.hamilton;

import java.util.Arrays;

public class Using2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        // Uses a nested loop to fill the 2 dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Creates a new board using default values
        char[][] boardTwo = new char[][] {
            new char[] {'-', '-', '-'},
            new char[] {'-', '-', '-'},
            new char[] {'-', '-', '-'},
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
