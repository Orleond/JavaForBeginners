package Exercises.Exercises13;
/*
 * Упражнение 13.1
 *
 * Обобщенный интерфейс очереди
 */
public interface IGenQ<T> {
    // Поместить элемент в очередь
    void put(T ch) throws QueueFullException;

    // Извлечь элемент из очереди
    T get() throws QueueEmptyException;
}
