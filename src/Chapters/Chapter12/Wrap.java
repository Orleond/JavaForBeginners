package Chapters.Chapter12;
/**
 * Упаковка и распаковка значений вручную
 */
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb);  // Отображает 100 и 100
    }
}
