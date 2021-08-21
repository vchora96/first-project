package ru.oshkin;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Panda {
    public static void main(String[] args) {
        int result;
        //отображается окно подтверждения
        result = showConfirmDialog(
                null,
                "хотите увидеть красную панду?",
                "вопрос",
                OK_CANCEL_OPTION
        );
        if (result == YES_OPTION) {
            System.out.println("Скоро будет панда");
            String file = "/Users/andrey.oshkin/IdeaProjects/project/src/ru/oshkin/p.jpeg";//полный путь к файлу с изображением
            //Создаем объект изображения
            ImageIcon amg = new ImageIcon(file);
            // отображается окто с картинкой
            showMessageDialog(
                    null,
                    amg,
                    "красная панда",
                    PLAIN_MESSAGE
            );

        }

    }
}
