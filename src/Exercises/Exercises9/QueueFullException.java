package Exercises.Exercises9;
/**
 * Упражнение 9.1
 * Исключение для ошибок, связанных с заполненной очередью
 */
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) { size = s; }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер: " + size;
    }
}
