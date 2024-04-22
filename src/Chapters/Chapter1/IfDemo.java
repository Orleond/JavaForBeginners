package Chapters.Chapter1;
/**
 * Демонстрация применения инструкции if
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b");

        // Следующая строка никогда не будет выведена
        if (a == b) System.out.println("Вы не должны будете увидеть этот текст");

        System.out.println();

        c = a - b;  // Переменная "с" содержит значение -1

        System.out.println("c содержит -1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a;  // Переменная "с" теперь содержит значение 1

        System.out.println("c содержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
