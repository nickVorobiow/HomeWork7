package com.company;

public class SolutionDZ1 {
    public static void task1(int sumOfMoneyToSave) {
        float savings = 0;
        int monthNumber = 1;
        while(savings < sumOfMoneyToSave) {
            savings += 15000.0f;
            savings *= 1.01f;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " +
                    savings + " рублей");
            monthNumber++;
        }
    }

    public static void task2() {
        byte num = 1;
        while(num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        num = 1;
        for(num = 10; num >= 1; num--) {
            System.out.print(num + " ");
        }
    }

    public static void task3() {
        final int totalPopulation = 12_000_000;
        int bornInAYear = totalPopulation / 1000 * 17;
        int diedInAYear = totalPopulation / 1000 * 8;
        int populationGrowthPerYear = bornInAYear - diedInAYear;
        byte year = 1;
        while ((byte)year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " +
                    (totalPopulation + populationGrowthPerYear * year));
            year++;
        }
    }
}
