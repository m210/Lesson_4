package com.company;

public class Main {

    public static void main(String[] args) {
//        task1();
//
//        task2();
//
//        task3();

        task4();

        task5();
    }

    public static void task1() {
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for(i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        int friday = 3;
        for(int i = 1; i <= 31; i++) {
            if((i % 7) == friday) {
                System.out.println("Сегодня пятница, " + i + "-e число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task3() {
        int year = 2021;
        int prev = year - 200;
        int next = year + 100;

        for(int i = prev; i <= next; i++) {
            if((i % 79) == 0)
                System.out.println(i);
        }
    }

    public static void task4() {
        for(int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if((i % 3) == 0 && (i % 5) == 0)
                System.out.print("ping pong\n");
            else if((i % 3) == 0)
                System.out.print("ping\n");
            else if((i % 5) == 0)
                System.out.print("pong\n");
            else
                System.out.print("\n");
        }
    }

    public static void task5() {
        int count = 8, p1 = 0, p2 = 1;
        while(count-- > 0) {
            int sum = p2 + p1;
            p1 = p2;
            p2 = sum;

            System.out.print(sum + " ");
        }
        System.out.println();
    }

}
