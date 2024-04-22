package Chapters.Chapter6;
/**
 * Простые типы данных передаются методам по значению
 */
public class Test {
    // Этот метод не может изменить значения аргументов,
    // передаваемых ему при вызове
    void noChange(int i, int j) {
        i += j;
        j = -j;
    }
}