public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }


    public static void Task1() {
        System.out.println("Задача №1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + (", сумма накоплений равна ") + total + (" рублей"));
        }

    }

    public static void Task2() {
        System.out.println("Задача №2");
        int i = 1;
        int j = 1;
        while (i < 11) {
            System.out.print((i) + (" "));
            i = i + 1;
        }
        System.out.println();
        for (j = 10; j > 0; j = j - 1) {
            System.out.print((j) + (" "));
        }
        System.out.println();
    }

    public static void Task3() {
        System.out.println("Задача №3");
        int population = 12_000_000;
        float BirthRate = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        int year = 0;
        for (year = 1; year < 11; year++) {
            population = (int) (population + (population * BirthRate) - (population * mortality));
            System.out.println("Год " + year + (" численность населения составляет " + population));


        }


    }

    public static void Task4() {
        System.out.println("Задача №4");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 12000_000) {
            total = (total + (total / 100) * 7);
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + (", сумма накоплений равна ") + total + (" рублей"));
        }

    }

    public static void Task5() {
        System.out.println("Задача №5");
        int salary = 15000;
        int total = 0;
        int month = 1;
        for (; total < 12_000_000; month++) {
            total = (total + (total / 100) * 7);
            total = total + salary;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + (", сумма накоплений равна ") + total + (" рублей"));

        }
    }

    public static void Task6() {
        System.out.println("Задача №6");
        int salary = 15000;
        int total = 0;
        int month = 1;
        for (; month < 108; month++) {
            total = (total + (total / 100) * 7);
            total = total + salary;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + (", сумма накоплений равна ") + total + (" рублей"));

        }
    }

    public static void Task7() {
        System.out.println("Задача №7");
        int day = 1;
        for (; day < 32; day++) {
            if (day % 7 == 0) {
                System.out.println(("Сегодня пятница, ") + day + ("-е число. Необходимо подготовить отчет"));
            }
        }
    }

    public static void Task8() {
        System.out.println("Задача №8");
        int year = 1896;
        for (; year <2123; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }


        }
    }
}

