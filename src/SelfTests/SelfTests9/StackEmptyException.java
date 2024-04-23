package SelfTests.SelfTests9;
/**
 * Исключение, возникающее при обращении к пустому стеку
 */
public class StackEmptyException extends Exception {
    public String toString() {
        return "\nСтек пуст";
    }
}