package Homeworks.Homeworks9;
/**
 * Отвечая на вопрос 3 в конце главы 6, вы создали
 * класс Stack. Добавьте в него пользовательские
 * исключения, чтобы программа нужным образом
 * реагировала на попытку поместить элемент в
 * переполненный стек и извлечь элемент из пустого
 * стека.
 */
public class Stack {
    private final int size;
    private final char[] array;
    private int numSymbol;

    Stack(int size) {
        this.size = size;
        array = new char[size];
        numSymbol = -1;
    }

    public void push(char symbol) throws FullStackException {
        if (numSymbol == size - 1)
            throw new FullStackException(size);
        else
            array[++numSymbol] = symbol;
    }

    public char pop() throws EmptyStackException {
        if (numSymbol == -1)
            throw new EmptyStackException();
        else {
            return array[numSymbol--];
        }
    }
}