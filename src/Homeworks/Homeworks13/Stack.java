package Homeworks.Homeworks13;
/**
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