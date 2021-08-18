package ru.oshkin;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        double v = Math.pow(a, 3);
        double v1 = Math.pow(a, 3);
        double s = 6 * Math.pow(a, 2);
        System.out.println("s =" + s);


    }
}
