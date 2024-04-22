package Chapters.Chapter9;
/**
 * Эта программа не будет работать!
 */
public class ExtTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("До генерации исключения");

            // Сгенерировать исключение в связи с
            // выходом индекса за пределы массива
            nums[7] = 10;
            System.out.println("Эта строка не будет отображаться");
        }
        // Исключение, связанное с обращением за пределы массива,
        // нельзя обработать с помощью инструкции catch, в которой
        // указан тип исключение ArithmeticException
        catch (ArithmeticException exc) {
            // Перехватить исключение
            System.out.println("Выход за пределы массива!");
        }
        System.out.println("После инструкции catch");
    }
}
