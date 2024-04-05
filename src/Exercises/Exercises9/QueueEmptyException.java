package Exercises.Exercises9;
/*
 * Упражнение 9.1
 * Исключение для ошибок, связанных с пустой очередью
 */
public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста.";
    }
}
