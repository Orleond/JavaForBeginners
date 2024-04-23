package SelfTests.SelfTests10;

import java.io.*;
/**
 * Копирование текстового файла с заменой пробелов дефисами.
 *
 * В этой версии программы используются символьные потоки.
 *
 * Для того чтобы воспользоваться этой программой, укажите
 * в командной строке имена исходного и целевого файлов. Например:
 *  java Hyphen2 source target
 */
public class Hyphen2 {
    public static void main(String[] args) {
        int i;

        // Сначала проверить, указаны ли имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: Hyphen2 откуда куда");
            return;
        }

        // Скопировать файл и заменить в нем пробелы дефисами,
        // используя инструкцию try с ресурсами
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();

                // Преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
