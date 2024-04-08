package Chapters.Chapter10;
/*
 * Чтение байтов с клавиатуры в массив
 */

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Введите символы.");
        System.in.read(data);   // Чтение байтового массива с клавиатуры
        System.out.print("Вы ввели: ");
        for (byte datum : data) {
            System.out.print((char) datum);
        }
    }
}
