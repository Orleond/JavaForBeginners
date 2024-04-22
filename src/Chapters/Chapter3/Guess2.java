package Chapters.Chapter3;

import java.io.IOException;
/**
 * Игра в угадывание букв, вторая версия
 */
public class Guess2 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("Задуманная буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");
        ch = (char) System.in.read();   // Чтение символа с клавиатуры

        if (ch == answer) System.out.println("** Правильно! **");
        else System.out.println("...Извините, вы не угадали.");
    }
}
