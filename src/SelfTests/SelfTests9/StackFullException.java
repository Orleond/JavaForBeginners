package SelfTests.SelfTests9;
/**
 * Исключение, возникающее при переполнении стека
 */
public class StackFullException extends Exception {
    int size;

    StackFullException(int s) { size = s; }

    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}
