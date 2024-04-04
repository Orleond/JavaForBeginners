package Chapters.Chapter2;
/*
 * Неожиданный результат повышения типов!
 */
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;
        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b); // Нужно приведение типов!

        System.out.println("i и b: " + i + " " + b);
    }
}
