package com.company;

public class Main {

    public static void main(String[] args) {
        task1();

        task2();

        task3();
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
}
