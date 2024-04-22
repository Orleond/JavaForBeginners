package Chapters.Chapter7;
/**
 * Методы с разными сигнатурами не переопределяются,
 * а перегружаются
 */
class B4 extends A4 {
    int k;
    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k - переопределение метода show() в А3
    void show(String msg) {
        System.out.println(msg + k);
    }
}
