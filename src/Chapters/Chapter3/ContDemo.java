package Chapters.Chapter3;
/**
 * Применение инструкции continue
 */
public class ContDemo {
    public static void main(String[] args) {
        int i;

        // Вывод четных чисел в пределах от 0 до 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // Завершение шага итерации
            System.out.println(i);
        }
    }
}
