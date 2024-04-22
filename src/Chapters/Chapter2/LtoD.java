package Chapters.Chapter2;
/**
 * Демонстрация автоматического преобразования типа Long
 * в тип double
 */
public class LtoD {
    public static void main(String[] args) {
        long l;
        double d;

        l = 100123285L;
        d = l;
        System.out.println("l и d: " + l + " " + d);
    }
}
