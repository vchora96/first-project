package ru.oshkin;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число: ");
        int b = sc.nextInt();
        System.out.println("Введите нвруральное число: ");
        int c = sc.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
