package Homeworks.Homeworks13;
/**
 * Задание Homework2
 */
public class FullStackException extends Exception {
    private int size;
    public FullStackException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Стек переполнен! Максимальный размер стека: " + size;
    }
}
