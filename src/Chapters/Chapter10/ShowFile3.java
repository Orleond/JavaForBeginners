package Chapters.Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * В этой версии программы ShowFile инструкция try с ресурсами
 * применяется для автоматического закрытия файла, когда в нем
 * больше нет необходимости
 */
public class ShowFile3 {
    public static void main(String[] args) {
        int i;

        // Прежде всего необходимо убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile3 имя_файла");
            return;
        }

        // Использование инструкции try с ресурсами для
        // открытия файла с последующим его закрытием после
        // того, как будет покинут блок try
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
