package Homeworks.Homeworks13;
/**
 * Видоизмените ответ на вопрос 10 в упражнении
 * для самопроверки из главы 9 таким образом, чтобы
 * сделать класс обобщенным. Для этого создайте
 * интерфейс стека IGenStack, объявив в нем обобщенные
 * методы push() и pop()
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