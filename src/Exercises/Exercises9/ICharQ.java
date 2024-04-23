package Exercises.Exercises9;
/**
 * Упражнение 9.1
 * Интерфейс очереди для хранения символов с генерированием исключений
 */
public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;

    // Извлечение символа из очереди
    char get() throws QueueEmptyException;
}