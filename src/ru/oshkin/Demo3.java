package ru.oshkin;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объет класса
        System.out.println("d = ");
        double d = scanner.nextDouble();
        double l = d * Math.PI;
        System.out.println("l = " + l);
    }
}
