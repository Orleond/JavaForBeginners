package Exercises.Exercises9;
/*
 * Упражнение 9.1
 * Класс, реализующий очередь фиксированного
 * размера для хранения символов.
 */
public class FixedQueue implements ICharQ {
    private char[] q;   // Массив для хранения элементов очереди
    private int putloc, getloc; // Индексы вставляемых и
                                // извлекаемых элементов

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }

    @Override
    // Извлечение символа из очереди
    public char get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
}
