package com.company;

public class GegalkinsPolinom {

    public int[][] getTriangleTable(int[] function) {
        int[][] preNormal = new int[function.length][function.length];
        for (int i = 0; i < function.length; i++) {
            preNormal[0][i] = function[i];
        }
        int[][] normalToWorkMatrix = Utils.transponateMatrix(preNormal);
        int iterLimit = normalToWorkMatrix.length;
        for (int j = 0; j < normalToWorkMatrix[0].length; j++) {
            iterLimit--;
            for (int i = 0; i < iterLimit; i++) {
                if (i + 1 != normalToWorkMatrix.length && j + 1 != normalToWorkMatrix[0].length) {
                    normalToWorkMatrix[i][j+1] = normalToWorkMatrix[i][j] ^ normalToWorkMatrix[i+1][j];
                }
            }
        }
        return normalToWorkMatrix;
    }

    public String getPolinom(int[] function) {
        String[] templates = {"1",   "z",   "y",   "yz",   "x",  "xz",  "xy",  "xyz"};
        int[][] triangleTable = getTriangleTable(function);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < triangleTable[0].length; i++) {
            result.append(triangleTable[0][i] == 1 ? " ⊕ " + templates[i] : "");
        }
        return result.toString();
    }
}
