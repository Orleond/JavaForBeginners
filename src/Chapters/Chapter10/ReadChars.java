package Chapters.Chapter10;

import java.io.*;
/**
 * Использование класса BufferedReader
 * для чтения символов с консоли
 */
public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы; окончание ввода - " +
                "символ точки");

        // Считывание символов
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
