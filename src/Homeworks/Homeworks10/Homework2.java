package Homeworks.Homeworks10;

import java.io.*;

/*
 * Напишите программу для копирования текстовых
 * файлов. Видоизмените ее таким образом, чтобы
 * все пробелы заменялись дефисами. Используйте
 * при написании программы классы, представляющие
 * байтовые потоки, а также традиционный способ
 * закрытия файла явным вызовом метода close;
 */
public class Homework2 {
    public static void main(String[] args) {
        String file = "src/Homeworks/Homeworks10/text.txt";
        String newFile = "src/Homeworks/Homeworks10/newtext.txt";
        int n;
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(newFile)) {
            do {
                n = fr.read();
                if (n == ' ') n = '-';
                fw.write(n);
            } while (n != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e);
        }
    }
}
