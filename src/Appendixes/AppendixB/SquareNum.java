package Appendixes.AppendixB;

import java.io.*;
/**
 * Класс, демонстрирующий использование
 * документирующих комментариев.
 * @author Herbert Schildt
 * @version 1.2
 */
public class SquareNum {
    /**
     * Этот метод возвращает квадрат значения параметра num.
     * Данное описание состоит из нескольких строк. Число строк
     * не ограничивается.
     * @param num Значение, которое требуется возвести в квадрат.
     * @return Квадрат числового значения параметра num.
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * Этот метод получает значение, введенное пользователем.
     * @return Введенное значение типа double.
     * @exception IOException Исключение при ошибке ввода.
     * @see IOException
     */
    public double getNumber() throws IOException {
        // Создать поток BufferedReader из стандартного
        // потока System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;

        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * В этом методе демонстрируется применение метода square().
     * @param args Не используется
     * @exception IOException Исключение при ошибке ввода
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Введите значение для возведения" +
                "в квадрат: ");
        val = ob.getNumber();
        val = ob.square(val);

        System.out.println("Квадрат введенного значения " + val);
    }
}
