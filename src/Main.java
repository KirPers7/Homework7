public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int cash = 15000;
        int totalSum = 0;
        int month = 0;

        while (totalSum <= 2_459_000) {
            totalSum += cash;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");

        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        byte enumeration = 0;
        while (enumeration < 10) {
            enumeration++;
            System.out.print(enumeration + " ");
        }
        System.out.println();

        for (; enumeration >= 1; enumeration--) {
            System.out.print(enumeration + " ");
        }
        System.out.println();
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRateDeathRate;
        int years = 1;

        for (; years <= 10; years++) {
            birthRateDeathRate = population / 1000;
            population += (17 - 8) * birthRateDeathRate;
            System.out.println("Год " + years + " численность населения составляет " + population);
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        int deposit = 15_000;
        int totalDeposit = 0;
        int monthCount = 0;

        while (totalDeposit < 12_000_000) {
            totalDeposit += totalDeposit * 7 / 100 + deposit;
            System.out.println("Месяц " + monthCount + " сумма на вкладе равна " + totalDeposit);
            monthCount++;
        }
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");

        int deposit2 = 15_000;
        int totalDeposit2 = 0;
        int monthCount2 = 0;

        while (totalDeposit2 < 12_000_000) {
            totalDeposit2 += totalDeposit2 * 7 / 100 + deposit2;
            if (totalDeposit2 >= 12_000_000 || monthCount2 % 6 == 0) {
                System.out.println("Месяц " + monthCount2 + " сумма на вкладе равна " + totalDeposit2);
            }
            monthCount2++;
        }
        System.out.println();

        //Задание 6
        System.out.println("Задание 6");

        int deposit3 = 15_000;
        int totalDeposit3 = 0;
        int monthCount3 = 0;

        while (monthCount3 <= 9 * 12) {
            totalDeposit3 += totalDeposit3 * 7 / 100 + deposit3;
            if (monthCount3 % 6 == 0) {
                System.out.println("Месяц " + monthCount3 + " сумма на вкладе равна " + totalDeposit3);
            }
            monthCount3++;
        }
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");

        int dayNumber = 6;

        for (; dayNumber <= 31; dayNumber++) {
            if ((dayNumber - 6) % 7 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчёт");
            }
        }
        System.out.println();

        //Задание 8
        System.out.println("Задание 8");

        short cometOverEarth = 0;
        short lowerLimit = 1824;
        short upperLimit = 2124;

        while (cometOverEarth <= upperLimit) {
            if (cometOverEarth >= lowerLimit) {
                System.out.println(cometOverEarth);
            }
            cometOverEarth += 79;
        }
    }
}