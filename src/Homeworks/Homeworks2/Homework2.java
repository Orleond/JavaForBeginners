package Homeworks.Homeworks2;
/*
 * Напишите программу, которая находила бы все простые
 * числа в диапазоне от 2 до 100
 */
public class Homework2 {
    public static void main(String[] args) {
        int count;
        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) System.out.print(i + " ");
        }
    }
}
