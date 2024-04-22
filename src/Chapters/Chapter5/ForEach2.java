package Chapters.Chapter5;
/**
 * Использование расширенного цикла for
 * для обработки двумерного массива
 */
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // Ввод ряда значений в массив nuns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // Использование цикла типа for-each для
        // суммирования и отображения значений
        for (int[] x: nums) {
            for (int y: x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
