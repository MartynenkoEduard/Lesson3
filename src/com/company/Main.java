package com.company;

import java.io.PrintStream;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //additionalTask1();
        //task4();
        //task5();
        //additionalTask2();
        //additionalTask3();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        task11();
    }

    public static void task1() {
        System.out.println("\nTask 1:" + System.lineSeparator());
        final double A = -5, B = 7, H = 0.75;
        System.out.printf("%4s%10s%10s%10s" + System.lineSeparator() +
                "-----------------------------------" +
                System.lineSeparator(), "X", "а)", "б)", "в)");
        for (double x = A; x <= B; x += H) {
            System.out.printf("%5.2f%10.2f%10.2f%10.2f\n", x, (x - Math.sin(x)), Math.pow(Math.sin(x), 2), 2 * Math.cos(x) - 1);
        }
    }

    public static void task2() {
        System.out.println("\nTask 2:" + System.lineSeparator());
        final double A = 3, B = -5, H = 0.5;
        System.out.println(" y = a * x * x + b\n");
        System.out.printf("%4s%8s%10s%8s" + System.lineSeparator() +
                "----------------------------------" +
                System.lineSeparator(), "y", "A", "B", "H");
        double x, y = 0;
        for (x = 1; x < 5; x += H) {
            y = A * Math.pow(x, 2) + B;
            //System.out.println(y);
            System.out.printf("|%-5.2f |   %-5.0f |  %-5.0f|  %-5.0f| %n", y, A, B, H);
        }
    }


    public static void task3() {
        System.out.println("\nTask 3: Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем\n" +
                "цифра b?" + System.lineSeparator());

        int number = 1232262855, a = 2, b = 5, digits = (int) Math.ceil(Math.log10(number)), mod = 0,
                counterA = 0, counterB = 0;
        int number1 = number;

        System.out.println(digits);
        for (int i = 0; i < digits; i++) {
            System.out.print(" " + (mod = number % 10));
            number /= 10;
            if (mod == a)
                counterA++;
            else if (mod == b)
                counterB++;
        }
        System.out.printf("\n%sВерно, что цифра %d встречается в нем реже, чем цифра %d\n\n", (counterA < counterB ? "" : "НЕ "), a, b);

    }


    // 1. В заданном натуральном числе поменять порядок цифр на обратный и сравнить полученное число с исходным.
    public static void additionalTask1() {

        int number = 154785695, digits = (int) Math.ceil(Math.log10(number));
        final int DIGITS = digits;
        long backnumber = 0;

        for (int i = 0; i < DIGITS; i++) {

            int mod = number % 10;
            double extent = Math.pow(10, (digits - 1));
            digits--;
            backnumber += mod * extent;
            number /= 10;
        }
        System.out.println(backnumber);

    }


    public static void task4() {
        System.out.println("\nTask 4: Вычислить значение функции" + System.lineSeparator());
        final int I = 20, N = 20;
        Random r = new Random();

        int k, f;
        double x = 0, z = 0, y = 0;

        for (int i = 1; i <= I; i++) {
            y = 0;
            f = 1;
            x = r.nextDouble() * 100;
            for (k = 1; k <= N; k++) {
                f *= k;
                y += Math.pow(x, k) / f;
            }
            z += y;
        }

        System.out.println("Z = " + z);

    }

    public static void task5() {
        System.out.println("\nTask 4: Вычислить значение функции" + System.lineSeparator());
        final int I = 15;
        double x = 5, z = 0, zSum = 0;
        long f = 1;

        for (int i = 1; i <= I; i++) {
            f *= i;

            z = (i + x) / f;
            zSum += z;
        }
        System.out.printf(" z = %2.2f", zSum);
    }

    //Для заданного числа найти все его делители
    public static void additionalTask2() {
        int x = 5879654;
        int counter = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    /*Натуральное число называют совершенным, если оно равно сумме всех своих делителей, включая 1. Например,
    6 = 1 + 2 + 3. Найти совершенные числа, меньшие заданного числа N.*/
    public static void additionalTask3() {
        int n = 1258769854;
        int counter = 0;
        int number = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.println(sum);
        }

    }

    public static void task6() {
        final int MAX_VALUE = 30;
        int x, y, k, n = 0;
        System.out.printf("%4s%8s%8s%n" + "---------------------%n", "x", "y", "k");
        for (x = 1; x <= MAX_VALUE; x++) {
            for (y = x + 1; y <= MAX_VALUE; y++) {
                for (k = 1; k <= MAX_VALUE; k++) {
                    if (x * x + y * y == k * k) {

                        System.out.printf("%3d^2 + %3d^2 = %3d^2%n", x, y, k);
                        n++;
                    }
                }
            }
        }
        System.out.println("Количество решений n = " + n);
    }

    public static void task7() {
        int counter = 0;
        final int VALUE = 19;
        for (int i = 100; counter < 15; i++) {

            if (i % VALUE == 0) {
                counter++;
                System.out.print(i + " ");
            }

        }
    }

    public static void task8() {
        final int DIVIDER13 = 13, DIVIDER17 = 17, COMPARER = 500;
        int number = COMPARER + 1;
        for (int n = 0; n < 20; ) {
            if ((number % DIVIDER13 == 0) && (number % DIVIDER17 == 0)) {
                n++;
                System.out.print(" " + number);
            }
            number++;
        }

    }

    /*Дана арифметическая прогрессия с параметрами а = 2, b = 4. Сколько нужно
взять членов прогрессии, начиная с первого, чтобы их сумма превысила
заданную величину Z. Написать программу решения задачи. Вывести искомое
число слагаемых, величину суммы и последнее слагаемое.*/
    public static void task9() {
        int a = 2, b = 4, step = 2, i = 0, z = 1546874653;
        do {
            a += step;
            i++;

        } while (a <= z);
        if (a > z) ;
        a -= step;
        i--;
        System.out.println("искомое число слагаемых  " + i + "\n");
        System.out.println("величина суммы  " + a + "\n");
    }

/*Дана арифметическая прогрессия 1, 5, 9, 13, ... Написать программу
определения суммы первых десяти ее членов. Вывести значение суммы и всех ее
слагаемых.*/

    public static void task10() {
        final int A = 1, STEP = 4;
        int sum = 0, addend = A;
        System.out.print(addend + " ");

        for (int i = 1; i < 10; i++) {
            addend += STEP;
            sum += addend;
            System.out.print(addend + " ");
        }
        System.out.println("\n" + "Сумма всех слагаемых " + sum);


    }

    /*Напишите программы, которые выводят на экран :
 прямоугольник
 прямоугольный треугольник
 равносторонний треугольник
 ромб*/
    public static void task11() {
        System.out.println("Прямоугольник");
        final int  A = 5;
        for (int j = 0; j < A ; j++) {
            for (int i = 0; i < A * 2; i++){
            System.out.print("|"); }
            System.out.println(); }


            System.out.println("Прямоугольный треугольник");
            int row = 10;
            for (int i = 1; i < row; i++) {

                for ( int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("Равносторонний треугольник" + System.lineSeparator());
            int N = 10;
            for (int column = 0; column < N; column++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for ( row = 0; row < N; row++) {
                for (int column = 0; column < N - row; column++) {
                    System.out.print(".");
                }
                for (int column = 0; column < (row + 1) * 2; column++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            System.out.println();
            System.out.println("Ромб" + System.lineSeparator());
            N = 10;
            for (int column = 0; column < N; column++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (row = 0; row < N; row++) {
                for (int column = 0; column < N - row; column++) {
                    System.out.print(".");
                }
                for (int column = 0; column < (row + 1) * 2; column++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (row = 0; row < N; row++) {
                for (int column = 0; column < row + 1; column++) {
                    System.out.print(".");
                }

                for (int column = 0; column < (N - row) * 2; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (row = 0; row < N; row++) {
                System.out.print(".");
            }
            System.out.println("*");
        }

    }
