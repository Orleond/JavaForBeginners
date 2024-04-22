package SelfTests.SelfTests8.qpack;
/**
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
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    @Override
    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
