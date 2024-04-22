package Chapters.Chapter7;
/*
 * Переопределение метода
 */

class B3 extends A3 {
    int k;
    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k - переопределение метода show() в А3
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
