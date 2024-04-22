package SelfTests.SelfTests6;
/**
 * Класс, реализующий стек для хранения символов
 */
public class Stack {
    private char[] stck; // Массив для хранения элементов стека
    private int tos; // Вершина стека

    // Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size]; // Выделить память для стека
        tos = 0;
    }

    // Создать один стек на основе другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // Скопировать элементы
        for (int i = 0; i < tos; i++)
            stck[i] =
                    ob.stck[i];
    }

    // Создать стек с начальными значениями
    Stack(char[] a) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // Поместить символ в стек
    void push(char ch) {
        if (tos == stck.length) {
            System.out.println(" -- Стек заполнен");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    // Извлечь символ из стека
    char pop() {
        if (tos == 0) {
            System.out.println(" -- Стек пуст”");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}