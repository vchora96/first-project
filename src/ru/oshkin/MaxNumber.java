package ru.oshkin;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите целое число:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее число =" + a);
        } else if (a == b) {
            System.out.println("Введеённые числа равны");
        } else {
            System.out.println("Большее число =" + b);
        }
    }
}
