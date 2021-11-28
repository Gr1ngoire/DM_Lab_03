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

        System.out.println("=============Task3(DDNF and DKNF)===========");
        DDNFandDKNF ddnFandDKNF = new DDNFandDKNF();
        System.out.println("DDNF:");
        System.out.println(ddnFandDKNF.getDDNF(testFunc));
        System.out.println("DKNF:");
        System.out.println(ddnFandDKNF.getDKNF(testFunc));
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

        System.out.println("=============Task5(Checks)===========");
        Checks checks = new Checks();
        System.out.println("Saves constant 0");
        System.out.println(checks.savesConstantZero(testFunc));
        System.out.println("Saves constant 0");
        System.out.println(checks.savesConstantOne(testFunc));
        System.out.println("Function is dual");
        System.out.println(checks.isDualFunction(testFunc));
        System.out.println("Function is monotone");
        System.out.println(checks.isMonotone(testFunc));
        System.out.println("Function is linear");
        System.out.println(checks.isLinear(gegalkinsPolinom.getPolinom(testFunc)));
        System.out.println("=====================================");
    }
}
