package ru.oshkin;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько чисел вы хотите просуммировать: ");
        int sum = 0;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Ввиде число: ");
            int b = sc.nextInt();
            if (b % 2 == 1) {
                sum += b;
            }
        }
        System.out.println(" Сумма не четных чисел = " + sum);
    }
}
