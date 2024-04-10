package Chapters.Chapter12;
/*
 * Демонстрация автоупаковки и автораспаковки
 */
public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;  // Автоупаковка целого числа

        int i = iOb;    // Автораспаковка

        System.out.println(i + " " + iOb);
    }
}
