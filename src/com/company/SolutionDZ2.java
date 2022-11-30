package com.company;

public class SolutionDZ2 {
    public static void task1() {
        int month = 0;
        int savings = 15000;
        while (savings < 12_000_000) {
            savings *= 1.07;
            month++;
            System.out.println("Сумма накоплений через " + month + " месяцев: " +
                    savings);
        }
        System.out.println("\nМесяцев потребуется:" + month);
    }

    public static void task2() {
        int month = 0;
        int savings = 15000;
        while (savings < 12_000_000) {
            savings *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений через " + month + " месяцев: " +
                        savings);
            }
        }
        System.out.println("\nМесяцев потребуется:" + month);
    }

    public static void task3() {
        int month = 0;
        int savings = 15000;
        while (month <= 9 * 12) {
            month++;
            savings *= 1.07;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений: " + savings);
            }
        }
    }

    public static void task4() {
        for (int dateOfFriday = 1; dateOfFriday <= 31; dateOfFriday += 7) {
            System.out.println("Сегодня пятница," + dateOfFriday +
                    "-е число. Необходимо подготовить отчет.");
        }
    }
}
