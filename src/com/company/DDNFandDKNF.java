package com.company;

public class DDNFandDKNF {
    public String getDDNF(int[] function) {
        StringBuilder result = new StringBuilder();
        TruthTable truthTable = new TruthTable();
        int[][] table = truthTable.getTable(function);
        for (int i = 0; i < function.length; i++) {
            String fragment = "(";
            if (table[i][3] == 1) {
                fragment += table[i][0] == 1 ? " x " : " x' ";
                fragment += table[i][1] == 1 ? "∧ y " : "∧ y' ";
                fragment += table[i][2] == 1 ? "∧ z ) " : "∧ z' ) ";
                result.append(fragment).append("∨ ");
            }
        }
        result.deleteCharAt(result.toString().length() - 2);
        return result.toString();
    }

    public String getDKNF(int[] function) {
        StringBuilder result = new StringBuilder();
        TruthTable truthTable = new TruthTable();
        int[][] table = truthTable.getTable(function);
        for (int i = 0; i < function.length; i++) {
            String fragment = "(";
            if (table[i][3] == 0) {
                fragment += table[i][0] == 0 ? " x " : " x' ";
                fragment += table[i][1] == 0 ? "v y " : "v y' ";
                fragment += table[i][2] == 0 ? "v z ) " : "v z' ) ";
                result.append(fragment).append("∧ ");
            }
        }
        result.deleteCharAt(result.toString().length() - 2);
        return result.toString();
    }
}
