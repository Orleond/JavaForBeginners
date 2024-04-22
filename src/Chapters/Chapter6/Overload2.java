package Chapters.Chapter6;
/**
 * Автоматическое преобразование типов может
 * влиять на выбор перегружаемого метода
 */
public class Overload2 {
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
