package Chapters.Chapter12;
/**
 * Пример использования аннотации @Deprecated.
 */
public class AnnoDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass("тест");

        System.out.println(obj.getMsg());
    }
}
