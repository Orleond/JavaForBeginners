package Chapters.Chapter3;
/**
 * Тело цикла for может быть пустым
 */
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // Суммируются числа от 1 до 5
        for (i = 1; i <= 5; sum += i++);

        System.out.println("Сумма: " + sum);
    }
}
