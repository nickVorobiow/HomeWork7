package com.company;

public class SolutionDZ3 {
    public static void task1() {
        final int currentYear = 2022;
        final int beginOfPeriod = currentYear - 200;
        final int endOfPeriod = currentYear + 100;
        int year = beginOfPeriod;

        while ((year + 79) <= endOfPeriod) {
            year += 79;
            System.out.println(year);
        }
    }
    public static void task2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
