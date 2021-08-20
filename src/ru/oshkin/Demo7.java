package ru.oshkin;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("a =");
        a = scanner.nextDouble();
        System.out.println("b =");
        b = scanner.nextDouble();
        System.out.println("c =");
        c = scanner.nextDouble();
        double v = a * b * c;
        System.out.println("v = " + v);


    }
}
