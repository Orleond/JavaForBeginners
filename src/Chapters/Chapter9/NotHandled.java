package Chapters.Chapter9;
/**
 * Обработка ошибки средствами виртуальной
 * машины Java
 */
public class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");

        // Сгенерировать исключение в связи с
        // выходом индекса за пределы массива
        nums[7] = 10;
    }
}
