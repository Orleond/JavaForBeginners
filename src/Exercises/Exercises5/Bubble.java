package Exercises.Exercises5;
/**
 * Упражнение 5.1
 * Демонстрация алгоритма пузырьковой сортировки
 */
public class Bubble {
    public static void main(String[] args) {
        int[] nums = { 99, -10, 100123, 18, -978,
                         5623, 463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10;  // Количество сортируемых элементов

        // Отображение исходного массива
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b-1] > nums[b]) {  // Если требуемый порядок
                                            // следования не соблюдается
                                            // поменять элементы местами
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

        // Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
