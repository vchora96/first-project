package ru.oshkin;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите любое целое число");
        int a = sc.nextInt();
        System.out.println("Введите любое целое число");
        int b = sc.nextInt();
        System.out.println("Числа от А до В = ");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
