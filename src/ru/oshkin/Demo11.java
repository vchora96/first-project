package ru.oshkin;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = sc.nextInt();
        System.out.println("Введите целое число: ");
        int b = sc.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }

    }
}
