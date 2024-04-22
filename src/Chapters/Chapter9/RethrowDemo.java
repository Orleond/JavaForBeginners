package Chapters.Chapter9;
/**
 * Повторное генерирование исключений
 */
public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // Повторный перехват исключения
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
        }
    }
}
