package Homeworks.Homeworks10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Напишите программу для копирования текстовых
 * файлов. Видоизмените ее таким образом, чтобы
 * все пробелы заменялись дефисами. Используйте
 * при написании программы классы, представляющие
 * байтовые потоки, а также традиционный способ
 * закрытия файла явным вызовом метода close;
 */
public class Homework1 {
    public static void main(String[] args) {
        String file = "src/Homeworks/Homeworks10/text.txt";
        String newFile = "src/Homeworks/Homeworks10/newtext.txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int n;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(newFile);
            do {
                n = fis.read();
                if (n == ' ') n = '-';
                fos.write(n);
            } while (n != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e);
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия исходного файла");
            }
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия нового файла");
            }
        }
    }
}
