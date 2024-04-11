package Homeworks.Homeworks13;
/*
 * Отвечая на вопрос 3 в конце главы 6, вы создали
 * класс Stack. Добавьте в него пользовательские
 * исключения, чтобы программа нужным образом
 * реагировала на попытку поместить элемент в
 * переполненный стек и извлечь элемент из пустого
 * стека.
 */
class Stack<T> implements IGenStack<T> {
    private final int size;
    private final T[] array;
    private int numSymbol;

    Stack(T[] array) {
        this.array = array;
        this.size = array.length;
        numSymbol = 0;
    }

    public void push(T o) throws FullStackException {
        if (numSymbol == size)
            throw new FullStackException(size);

        array[numSymbol] = o;
        numSymbol++;
    }

    public T pop() throws EmptyStackException {
        if (numSymbol == 0)
            throw new EmptyStackException();

        return array[--numSymbol];

    }
}
public class Homework2 {
    public static void main(String[] args) {
        Character[] a = new Character[10];
        Stack<Character> st1 = new Stack<>(a);

        // Помещение ряда символов в очередь q1
        for (int i = 0; i < 11; i++) {
            try {
                st1.push((char)('A' + i));
            } catch (FullStackException e) {
                System.out.println(e);
            }
        }

        // Отображение очередей
        System.out.print("Содержимое st1: ");
        for (int i = 0; i < 11; i++) {
            try {
                System.out.print(st1.pop() + " ");
            } catch (EmptyStackException e) {
                System.out.println(e);
            }
        }
    }
}
