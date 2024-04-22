package Chapters.Chapter1;
/**
 * Демонстрация различий между типами int и double
 */
public class Example3 {
    public static void main(String[] args) {
        int var;    // Объявление целочисленной переменной
        double x;   // Объявление переменной с плавающей точкой

        var = 10;   // Присваивание переменной var значения 10

        x = 10.0;   // Присваивание переменной x значения 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();   // Печать пустой строки

        // Деление значения обеих переменных на 4
        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
    }
}
