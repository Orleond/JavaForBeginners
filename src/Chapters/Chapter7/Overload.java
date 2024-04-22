package Chapters.Chapter7;
/**
 * Методы с разными сигнатурами не переопределяются,
 * а перегружаются
 */
public class Overload {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);

        subOb.show("k: ");  // вызов метода show() из класса B4
        subOb.show();   // Вызов метода show() из класса A4
    }
}