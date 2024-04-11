package Exercises.Exercises13;
/*
 * Упражнение 13.1
 */
public class CircularQueue<T> implements IGenQ<T> {
    private T[] arr;   // Массив для хранения элементов очереди
    private int putloc, getloc; // Индексы вставляемых и
                                // извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue(T[] arr) {
        this.arr = arr;
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(T o) throws QueueFullException {
        if (putloc + 1 == getloc | ((putloc == arr.length - 1) & (getloc == 0)))
            throw new QueueFullException(arr.length);

        arr[putloc++] = o;
        if (putloc == arr.length) putloc = 0; // Перейти в начало массива

    }

    @Override
    // Извлечение символа из очереди
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        T t = arr[getloc++];
        if (getloc == arr.length) getloc = 0; // Вернуться в
                                            // начало очереди
        return t;
    }
}
