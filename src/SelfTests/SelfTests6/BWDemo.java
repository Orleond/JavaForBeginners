package SelfTests.SelfTests6;
/**
 * Отображение символов строки в обратном порядке
 * с помощью рекурсии
 */
public class BWDemo {
    public static void main(String[] args) {
        Backwards s = new Backwards("Это тест");
        s.backward(0);
    }
}
