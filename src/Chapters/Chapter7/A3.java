package Chapters.Chapter7;
/**
 * Переопределение метода
 */
class A3 {
    int i, j;

    A3(int a, int b) {
        i = a;
        j = b;
    }

    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
