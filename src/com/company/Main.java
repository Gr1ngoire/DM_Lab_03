package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testFunc = {1, 0, 1, 1, 0, 1, 1, 0}; // 0 1 0 0 1 0 0 1
        System.out.println("=============Task1(Truth Table)===========");
        System.out.println("   x\t\ty\t\tz\t\tF");
        TruthTable truthTable = new TruthTable();
        Utils.printMatrix(truthTable.getTable(testFunc));
        System.out.println("==========================================");

        System.out.println("=============Task2(Dual function)===========");
        DualFunction dualFunction = new DualFunction();
        Utils.printArray(dualFunction.getDualFunc(testFunc));
        System.out.println("===============================");

        System.out.println("=============Task3()===========");
        System.out.println("===============================");

        System.out.println("=============Task4(Gigalkin's polinom)===========");
        String[][] columns = {{"1",   "z",   "y",   "yz",   "x",  "xz",  "xy",  "xyz"},
                              {"000", "001", "010", "011", "100", "101", "110", "111"}};
        GegalkinsPolinom gegalkinsPolinom = new GegalkinsPolinom();
        System.out.println("Table");
        Utils.printMatrix(columns);
        Utils.printMatrix(gegalkinsPolinom.getTriangleTable(testFunc));
        System.out.println("Polinom");
        System.out.println(gegalkinsPolinom.getPolinom(testFunc));
        System.out.println("=================================================");
    }
}
