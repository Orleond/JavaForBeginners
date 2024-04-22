package Chapters.Chapter9;
/**
 * Использование специально создаваемого исключения
 */
public class CustomExceptDemo {
    public static void main(String[] args) {
        // В массиве numer содержатся нечетные числа
        int[] numer = { 4, 8, 15, 32, 64, 127 , 256, 512};
        int[] denom = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NonOntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " +
                        denom[i] + " равно " +
                        numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Перехватить исключение
                System.out.println("Попытка деления на нуль");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Перехват исключения
                System.out.println("Соответствующий элемент не найден");
            } catch (NonOntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
