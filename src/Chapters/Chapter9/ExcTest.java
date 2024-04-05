package Chapters.Chapter9;
/*
 * Исключение можеть быть сгенерировано одним
 * методом, а перехваено другим.
 *
 * Использование методов класса Throwable.
 */
public class ExcTest {
    // Генерация Исключения
    static void genException() {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");

        // Генерирование исключения в связи с
        // выходом индекса за пределы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}
