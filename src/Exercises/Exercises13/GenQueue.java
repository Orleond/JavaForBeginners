package Exercises.Exercises13;
/*
 * Упражнение 13.1
 *
 * Обобщенный класс, реализующий очередь фиксированного размера
 */
public class GenQueue<T> implements IGenQ<T> {
    private T[] q;  // Массив для хранения элементов оереди
    private int putloc, getloc; // Индексы вставки и извлечения
                                // элементов очереди

    // Создание пустой очереди из заданного массива
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    @Override
    // Поместить элемент в очередь
    public void put(T obj) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    @Override
    // Извлечь элемент из очереди
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
