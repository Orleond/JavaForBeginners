package Homeworks.Homeworks5;
/*
 * Напишите программу, в которой массив используется
 * для нахождения среднего арифметического десяти
 * значений типа double. Используйте любые десять чисел
 */
public class Homework1 {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 1; i < array.length; i++) {
            array[i] = i + i / 3.0;
        }
        double sum = 0;
        for (double num: array)
            sum += num;

        double result = sum / array.length;

        System.out.println(result);
    }
}
