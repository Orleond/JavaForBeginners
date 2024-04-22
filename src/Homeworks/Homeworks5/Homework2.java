package Homeworks.Homeworks5;
/**
 * Измените программу, написанную в упражнении 5.1,
 * таким образом, чтобы она сортировала массив строк.
 * Продемонстрируйте ее работоспособность
 */
public class Homework2 {
    public static void main(String[] args) {
        String[] str = {"this", "is", "a", "test",
                "of", "a", "string", "sort"};
        int a, b, c;
        String t;

        // Отображение исходного массива
        System.out.print("Исходный массив:");
        for (String s : str) System.out.print(" " + s);
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < str.length; a++)
            for (b = str.length - 1; b >= a; b--) {
                int len = Math.min(str[b - 1].length(), str[b].length());
                for (c = 0; c < len; c++) {
                    if (str[b-1].charAt(c) > str[b].charAt(c)){
                        t = str[b-1];
                        str[b-1] = str[b];
                        str[b] = t;
                        break;
                    } else break;
                }
            }

        // Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();
    }
}
