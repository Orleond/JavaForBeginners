package Exercises.Exercises6;
/**
 * Упражнение 6.3
 * Простая версия класса Quicksort,
 * реализующего быструю сортировку
 */
public class QSDemo {
    public static void main(String[] args) {
        char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Исходный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        // Сортировка массива
        QuickSort.qsort(a);

        System.out.print("Отсортированный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
