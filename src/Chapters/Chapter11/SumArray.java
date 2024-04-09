package Chapters.Chapter11;
/*
 * Использование ключевого слова synchronized для
 * управления доступом
 */
public class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;

        for (int num : nums) {
            sum += num;
            System.out.println("Текущее значение суммы для " +
                    Thread.currentThread().getName() +
                    " будет " + sum);
            try {
                Thread.sleep(10);     // Разрешение переключения
                // между задачами
            } catch (InterruptedException exc) {
                System.out.println("Поток прерван.");
            }
        }
        return sum;
    }
}
