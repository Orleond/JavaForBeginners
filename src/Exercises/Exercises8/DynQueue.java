package Exercises.Exercises8;
/*
 * Упражнение 8.1
 * Динамическая модель
 */
public class DynQueue implements ICharQ {
    private char[] q;   // Масси для хранения элементов очереди
    private int putloc, getloc; // Индексы вставляемых и
                                // извлекаемых элементов

    // Создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = new char[size]; // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    @Override
    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            // Увеличение размера очереди
            char[] t = new char[q.length * 2];

            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putloc++] = ch;
    }

    @Override
    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очерель пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
