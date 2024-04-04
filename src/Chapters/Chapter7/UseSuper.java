package Chapters.Chapter7;
/*
 * Использование ключевого слова super
 * для предотвращения сокрытия имен
 */
class A {
    int i;
}

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
public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
