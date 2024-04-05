package Chapters.Chapter9;

import java.io.IOException;

/*
 * Использование ключевого слова throws
 */
public class TrowsDemo {
    public static char prompt(String str) throws IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Введите букву");
        } catch (IOException exc) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу: " + ch);
    }
}
