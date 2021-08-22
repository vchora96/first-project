package ru.oshkin;

import java.time.format.SignStyle;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println(-1);
        } else if (a > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}
