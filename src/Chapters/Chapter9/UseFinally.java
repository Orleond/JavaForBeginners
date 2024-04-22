package Chapters.Chapter9;
/**
 * Использование блока finally
 */
public class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0 -> t = 10 / what;    // Сгенерировать ошибку деления на нуль
                case 1 -> nums[4] = 4;  // Сгенерировать ошибку обращения к массиву
                case 2 -> {
                    return; // Возврат из блока try
                }
            }
        } catch (ArithmeticException exc) {
            // Перехват исключения
            System.out.println("Попытка деления на нуль");
            return; // Возврат из блока catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            // Перехват исключения
            System.out.println("Соответствующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }
}
