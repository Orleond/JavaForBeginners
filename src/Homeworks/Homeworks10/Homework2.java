package Homeworks.Homeworks10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Перепишите программу Homework1 таким образом,
 * чтобы в ней использовались классы,
 * представляющие символьные потоки. На этот
 * раз воспользуйтесь инструкцией try с
 * ресурсами для автоматического закрытия файла.
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
