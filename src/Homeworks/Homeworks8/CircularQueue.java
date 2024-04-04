package Homeworks.Homeworks8;

/*
 * Кольцевая очередь
 */
public class CircularQueue implements ICharQ {
    private char[] q;   // Массив для хранения элементов очереди
    private int putloc, getloc; // Индексы вставляемых и
                                // извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue(int size) {
        q = new char[size+1];   // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) {
        // Очередь считается полной, если индекс putloc на единицу
        // меньше индекса getloc или если индекс putloc указывает
        // на корец массива, а инлекс getloc - на его начало
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // Перейти в начало массива

    }

    @Override
    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // Вернуться в
                                            // начало очереди
        return ch;
    }
}
