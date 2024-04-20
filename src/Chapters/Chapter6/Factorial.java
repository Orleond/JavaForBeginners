package Chapters.Chapter6;
/*
 * Простой пример рекурсии
 */
public class Factorial {
    // Рекурсивный метод
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
