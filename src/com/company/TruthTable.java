package com.company;

public class TruthTable {
    public int[][] getTable(int[] function) {
        int[][] result = new int[function.length][4];
        result[0] = new int[]{0, 0, 0, 0};
        result[1] = new int[]{0, 0, 1, 0};
        result[2] = new int[]{0, 1, 0, 0};
        result[3] = new int[]{0, 1, 1, 0};
        result[4] = new int[]{1, 0, 0, 0};
        result[5] = new int[]{1, 0, 1, 0};
        result[6] = new int[]{1, 1, 0, 0};
        result[7] = new int[]{1, 1, 1, 0};
        for (int i = 0; i < function.length; i++) {
            result[i][3] = function[i];
        }
        return result;
    }
}
