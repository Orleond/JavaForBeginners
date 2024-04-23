package Chapters.Chapter9;
/**
 * Исключение может быть сгенерировано одним
 * методом, а перехвачено другим.
 */
public class ExcTest {
    // Генерация Исключения
    static void genException() {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");

        // Выход за пределы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}