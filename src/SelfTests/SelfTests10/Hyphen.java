package SelfTests.SelfTests10;

import java.io.*;
/**
 * Копирование текстового файла с заменой пробелов дефисами.
 *
 * В этой версии программы используются байтовые потоки.
 *
 * Для того чтобы воспользоваться этой программой, укажите
 * в командной строке имена исходного и целевого файлов. Например:
 *  java Hyphen source target
 */
public class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Сначала проверить, указаны ли имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: Hyphen откуда куда");
            return;
        }

        // Скопировать файл и заменить в нем пробелы дефисами
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();

                // Преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла.");
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла.");
            }
        }
    }
}
