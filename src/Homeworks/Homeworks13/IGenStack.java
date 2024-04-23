package Homeworks.Homeworks13;
/**
 * Видоизмените ответ на вопрос 10 в упражнении
 * для самопроверки из главы 9 таким образом, чтобы
 * сделать класс обобщенным. Для этого создайте
 * интерфейс стека IGenStack, объявив в нем обобщенные
 * методы push() и pop()
 */
public interface IGenStack<T> {
    void push(T o) throws FullStackException;
    T pop() throws EmptyStackException;
}
