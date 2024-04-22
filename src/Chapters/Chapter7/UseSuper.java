package Chapters.Chapter7;
/**
 * Использование ключевого слова super
 * для предотвращения сокрытия имен
 */
public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
