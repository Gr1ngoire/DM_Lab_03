package com.company;

public class Utils {
    public static int[][] transponateMatrix(int[][] toTransponate) {
        int[][] result = new int[toTransponate[0].length][toTransponate.length];
        for (int i = 0; i < toTransponate.length; i++) {
            for (int j = 0; j < toTransponate[0].length; j++) {
                result[i][j] = toTransponate[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            StringBuilder fragmentum = new StringBuilder();
            for (int j = 0; j < toPrint[0].length; j++) {
                fragmentum.append("| ").append(toPrint[i][j]).append(" |").append("\t");
            }
            System.out.println(fragmentum);
        }
    }

    public static void printMatrix(String[][] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            StringBuilder fragmentum = new StringBuilder();
            for (int j = 0; j < toPrint[0].length; j++) {
                fragmentum.append(toPrint[i][j]).append("\t\t");
            }
            System.out.println(fragmentum);
        }
    }

    public static void printArray(int[] toPrint) {
        StringBuilder result = new StringBuilder();
        for (int i: toPrint) {
            result.append(i).append("\t");
        }
        System.out.println(result);
    }
}
