package Chapters.Chapter6;
/*
 * Автоматичекое преобразование типов может
 * влиять на выбор перегружаемого метода
 */
class Overload2 {
    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }

    void f(byte x) {
        System.out.println("Внутри f(byte): " + x);
    }
}
public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5f;

        ob.f(i);    // Вызов метода ob.f(int)
        ob.f(d);    // Вызов метода ob.f(double)

        ob.f(b);    // Вызов метода ob.f(byte) без преобразования типов

        //ob.f(b);    // Вызов метода ob.f(int) с преобразованием типов
        ob.f(s);    // Вызов метода ob.f(int) с преобразованием типов
        ob.f(f);    // Вызов метода ob.f(double) с преобразованием типов
    }
}
