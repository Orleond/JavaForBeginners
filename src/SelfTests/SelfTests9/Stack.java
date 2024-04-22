package SelfTests.SelfTests9;
/**
 * Класс, реализующий стек для хранения символов
 */
public class Stack {
    private char[] stck;    // Массив для хранения элементов стека
    private int tos;    // Вершина стека

    // Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size];  // Выделить память для стека
        tos = 0;
    }

    // Создать один стек на основе другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // Скопировать элементы
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Создать стек с начальными значениями
    Stack(char[] a) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Поместить символ в стек
    void push(char ch) throws StackFullException {
        if (tos == stck.length)
            throw new StackFullException(stck.length);

        stck[tos] = ch;
    }

    // Извлечь символ из стека
    char pop() throws StackEmptyException {
        if (tos == 0)
            throw new StackEmptyException();

        tos--;
        return stck[tos];
    }
}
