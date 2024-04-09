package Chapters.Chapter11;
/*
 * Использование синхронизированного блока
 * для управления доступом к SumArray
 */
public class SumArray2 {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0;    // Обнуление суммы

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
