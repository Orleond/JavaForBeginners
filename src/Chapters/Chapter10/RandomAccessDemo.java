package Chapters.Chapter10;

import java.io.*;
/**
 * Демонстрация произвольного доступа к файлам
 */
public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 73.25 };
        double d;

        // Открыть и использовать файл с произвольным доступом
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // Запись значения в файл
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Считывание отдельных значений из файла
            raf.seek(0);    // Найти первое значение типа double
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8);    // Найти второе значение типа double
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);

            raf.seek(8 * 3);    // Найти четвертое значение типа double
            d = raf.readDouble();
            System.out.println("Четвертое значение: " + d);

            System.out.println();

            // Прочитать значения через одно
            System.out.println("Чтение значений с нечетными " +
                    "порядковым номерами: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i);    // Найти i-е значение типа double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
