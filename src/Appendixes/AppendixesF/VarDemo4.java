package Appendixes.AppendixesF;
/**
 * Использование выведения типов в циклах for
 */
public class VarDemo4 {
    public static void main(String[] args) {

        // Выведение типа переменной цикла
        System.out.print("Значения x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        // Выведение типа итерационной переменной
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Значения в массиве nums: ");
        for(var v : nums)
            System.out.print(v + " ");

        System.out.println();
    }
}
