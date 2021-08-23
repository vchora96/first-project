package ru.oshkin;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = sc.nextInt();
        System.out.println("Введите целое число: ");
        int b = sc.nextInt();
        System.out.println("Введите целое число: ");
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("3");
        } else if (a == b) {
            System.out.println("2");
        } else if (a != c) {
            System.out.println("0");
        }
    }
}
