package Homeworks.Homeworks3;

import java.io.IOException;

/*
 * Напишите программу, которая считывает символы с
 * клавиатуры до тех пор, поока не встретится точка.
 * Предусмотрите в программе счетчик пробелов. Сведения
 * о количестве пробелов должны выводиться в конце программы
 */
public class Homework1 {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;
        for (;;) {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
            if (ch == '.') break;
        }
        System.out.println("Количество пробелов: " + spaces);
    }
}
