package SelfTests.SelfTests13;
/**
 * Обобщенный стек
 */
public interface IGenStack<T> {
    void push(T obj) throws StackFullException;
    T pop() throws StackEmptyException;
}
