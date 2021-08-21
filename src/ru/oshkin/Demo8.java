package ru.oshkin;

import static java.lang.Integer.parseInt;
import static java.lang.Math.random;
import static javax.swing.JOptionPane.*;

public class Demo8 {
    public static void main(String[] args) {
        int number, answer, icon; // объявили целочисленные переменные
        String txt; // ссылка на объект типа стринг
        // Случайное число от 1 до 5
        number = (int) (5 * random()) + 1; // Сгенерировали рандомное число ипривели к типу int
        System.out.println(number);// вывод в консоль загаданного числа
        String data = showInputDialog(
                null,
                "угадайте число от 1 до 5: ",
                "число",
                QUESTION_MESSAGE
        );// Запрашиваем число от пользователя
        answer = parseInt(data);
        if (answer == number) {
            txt = "Вы угадали! Это число " + number + "!";
            icon = INFORMATION_MESSAGE;
        } else {
            txt = "Вы не угадали! Это число " + number + "!";
            icon = ERROR_MESSAGE;
        }
        showMessageDialog(null, txt, "результат", icon);
    }
}
