package Chapters.Chapter14;
/*
 * Обобщенный функциональный интерфейс с двумя параметрами,
 * который возвращает результат типа boolean
 */
public interface SomeTest<T> {
    boolean test(T n, T m );
}
