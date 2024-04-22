package Chapters.Chapter7;
/**
 * Методы с разными сигнатурами не переопределяются,
 * а перегружаются
 */
class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
