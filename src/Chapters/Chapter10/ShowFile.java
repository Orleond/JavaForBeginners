package Chapters.Chapter10;

import java.io.*;
/**
 * Отображение текстового файла
 *
 * При вызове этой программы следует указать имя файла,
 * содержимое которого требуется посмотреть.
 * Например, для вывода на экран содержимого файла TEST.TXT
 * необходимо ввести в командной строке следующую команду:
 * java ShowFile TEST.TXT
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Сначала нужно убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream((args[0]));
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            // Чтение байтов, пока не встретится символ EOF
            do {
                i = fin.read(); // Считывание данных из файла
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла");
        } finally {
            // Закрыть файл при выходе из блока try
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
