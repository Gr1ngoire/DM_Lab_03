package com.company;

public class DualFunction {
    public int[] getDualFunc(int[] function) {
        int[] toReverse = new int[function.length];
        for (int i = 0; i < function.length; i++) {
            toReverse[i] = function[i] == 1 ? 0 : 1;
        }
        int[] result = new int[toReverse.length];
        for (int i = toReverse.length - 1; i > 0; i--) {
              result[toReverse.length - 1 - i] = toReverse[i];
        }
        return result;
    }
}
