package SelfTests.SelfTests6;
/**
 * Отображение символов строки в обратном порядке
 * с помощью рекурсии
 */
public class Backwards {
    String str;
    Backwards(String s) {
        str = s;
    }
    void backward(int idx) {
        if (idx != str.length() - 1) backward(idx + 1);
        System.out.print(str.charAt(idx));
    }
}
