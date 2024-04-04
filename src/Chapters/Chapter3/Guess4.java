package Chapters.Chapter3;

import java.io.IOException;
/*
 * Игра в угадывание букв, четвертая версия
 */
public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Задуманная буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");

            // Получение символа с клавиатуры
            ch = (char) System.in.read();

            // Отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");

                // Вложенная инструкция if
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);


    }
}
