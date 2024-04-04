package Chapters.Chapter7;


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

class B4 extends A3 {
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
public class Overload {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);

        subOb.show("k: ");  // вызов метода show() из класса B4
        subOb.show();   // Вызов метода show() из класса A4
    }
}