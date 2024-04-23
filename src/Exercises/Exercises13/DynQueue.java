package Exercises.Exercises13;
/**
 * Упражнение 8.1
 * Динамическая модель
 */
public class DynQueue<T> implements IGenQ<T> {
    private T[] q;   // Массив для хранения элементов очереди
    private int putloc, getloc; // Индексы вставляемых и
                                // извлекаемых элементов

    // Создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = (T[])new Object[size]; // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(T o) {
        if (putloc == q.length) {
            // Увеличение размера очереди
            T[] t = (T[])new Object[q.length * 2];

            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putloc++] = o;
    }

    @Override
    // Извлечение символа из очереди
    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
