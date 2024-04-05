package Chapters.Chapter9;
/*
 * Использование средства группового перехвата исключений.
 * Примечание: для компиляции этого кода требуется JDK 7 или выше.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chrs = { 'A', 'B', 'C' };

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    result = a / b; // Генерирование исключение
                                    // ArithmeticException
                else
                    chrs[5] = 'X';  // Генерирование исключения
                                    //ArrayIndexOutOfBoundsException
            }
            // В этой инструкции catch организуется перехват
            // обоих исключений
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение: " + e);
            }
        }
        System.out.println("После группового перехватика исключений");
    }
}
