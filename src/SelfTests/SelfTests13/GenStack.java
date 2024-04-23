package SelfTests.SelfTests13;
/**
 * Класс, реализующий стек для хранения символов
 */
public class GenStack<T> implements IGenStack<T> {
    private T[] stck;   // Массив для хранения элементов стека
    private int tos;    // Вершина стека

    // Создать пустой стек заданного размера
    GenStack(T[] stckArray) {
        stck = stckArray;
        tos = 0;
    }

    // Создать один стек на основе другого стека
    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;

        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        // Скопировать элементы
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Создать стек с начальными значениями
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Поместить объект в стек
    public void push(T obj) throws StackFullException {
        if (tos == stck.length)
            throw new StackFullException(stck.length);

        stck[tos] = obj;
        tos++;
    }

    // Извлечь объект из списка
    public T pop() throws StackEmptyException {
        if (tos == 0)
            throw new StackEmptyException();

        tos--;
        return stck[tos];
    }
}
