package Chapters.Chapter5;
/*
 * Использование цикла типа for-each
 */
public class ForEach {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Использование цикла типа for-each для
        // суммирования и отображения значений
        for (int x: nums) {
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum);
    }
}
