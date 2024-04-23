package Chapters.Chapter10;

import java.io.*;
/**
 * Чтение символьных строк с консоли с использованием
 * класса BufferedReader
 */
public class ReadLines {
    public static void main(String[] args) throws IOException {
        // Создать объект типа BufferedReader,
        // связанный с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите текстовые строки");
        System.out.println("Признак конца ввода - строка 'stop'");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
