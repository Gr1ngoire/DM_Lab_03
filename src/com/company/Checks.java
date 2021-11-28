package com.company;

public class Checks {
    public boolean savesConstantZero(int[] function) {
        return function[0] == 0;
    }

    public boolean savesConstantOne(int[] function) {
        return function[function.length - 1] == 1;
    }

    public boolean isDualFunction(int[] function) {
        DualFunction dualFunction = new DualFunction();
        int[] dual = dualFunction.getDualFunc(function);
        for (int i = 0; i < function.length; i++) {
            if (function[i] != dual[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotone(int[] function) {
        TruthTable truthTable = new TruthTable();
        int[][] table = truthTable.getTable(function);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (table[i][0] <= table[j][0] && table[i][1] <= table[j][1] && table[i][2] <= table[j][2]) {
                    if (table[j][3] > table[i][3]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isLinear(String gegalkinsPolinom) {
        if (gegalkinsPolinom.equals("") || gegalkinsPolinom.equals("x") || gegalkinsPolinom.equals("y") || gegalkinsPolinom.equals("z")) {
            return true;
        } else {
            return gegalkinsPolinom.matches("([xyz] ⊕ [xyz]) (⊕ [xyz])*");
        }
    }
}
