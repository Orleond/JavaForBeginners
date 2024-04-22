package Chapters.Chapter7;
/**
 * Создание подкласса, расширяющего класс А
 */
class B extends A {
    int i; // Эта переменная i скрывает переменную i из класса А

    B(int a, int b) {
        super.i = a;    // Переменная i из класса A
        i = b;    // Переменная i из класса B
    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
