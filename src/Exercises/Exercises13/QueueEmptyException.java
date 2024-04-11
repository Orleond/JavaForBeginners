package Exercises.Exercises13;
/*
 * Упражнение 13.1
 *
 * Исключение, указывающее на исчерпание очереди
 */
public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста.";
    }
}
