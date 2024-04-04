package Chapters.Chapter6;
/*
 * Простой пример рекурсии
 */
class Factorial {
    // Рекурсиивный метод
    int factR(int n) {
        if (n == 1) return 1;
        return factR(n - 1) * n;
    }

    // Вариант программы, вычисляющей факториал
    // итеративным способом
    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Вычисление рекурсивным методом");
        System.out.println("Факториал 3 равен " + f.factR(3));
        System.out.println("Факториал 4 равен " + f.factR(4));
        System.out.println("Факториал 5 равен " + f.factR(5));
        System.out.println();

        System.out.println("Вычисление итеративным методом");
        System.out.println("Факториал 3 равен " + f.factI(3));
        System.out.println("Факториал 4 равен " + f.factI(4));
        System.out.println("Факториал 5 равен " + f.factI(5));
    }
}
