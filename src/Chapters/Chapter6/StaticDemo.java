package Chapters.Chapter6;
/**
 * Применение статической переменной
 */
public class StaticDemo {
    int x;  // Обычная переменная экземпляра
    static int y;   // Статическая переменная

    // Возврат суммы значение переменной экземпляра x и
    // статической переменной y
    int sum() {
        return x + y;
    }
}
