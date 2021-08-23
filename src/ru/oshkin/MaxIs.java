package ru.oshkin;

import java.util.Scanner;

public class MaxIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int a = sc.nextInt();
        System.out.println("Введите любое целое число: ");
        int b = sc.nextInt();
        System.out.println("Введите любое целое число: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Наибольшее из введенных чисел: " + a);
        } else if (b > a && b > c) {
            System.out.println(" Наибольшее из введенных чисел: " + b);
        } else if (a == b && a == c) {
            System.out.println(" Введеные числа равны");
        } else {
            System.out.println(" Наибольшее из введенных чисел: " + c);
        }
    }

}