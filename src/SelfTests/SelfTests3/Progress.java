package SelfTests.SelfTests3;

/**
 * Использование цикла for для формирования
 * геометрической прогрессии:
 *
 * 1, 2, 4, 8, 16, 32...
 */
public class Progress {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += i) {
            System.out.print(i + " ");
        }
    }
}
