package SelfTests.SelfTests13;
/**
 * Исключение, возникающее при переполнении стека
 */
class StackFullException extends Exception {
    int size;
    public StackFullException(int s) { size = s; }

    public String toString() {
        return "\nСтек переполнен! Максимальный размер стека: " + size;
    }
}
