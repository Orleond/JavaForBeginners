package Homeworks.Homeworks3;
/**
 * Напишите цикл for, в котором перебирались бы
 * значения от 1000 до 0 с шагом 2
 */
public class Homework2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i >= 0; i -= 2) count++;

        System.out.println(count);
    }
}
