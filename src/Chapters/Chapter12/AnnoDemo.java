package Chapters.Chapter12;
/*
 * Пример использования аннтоации @Deprecated.
 */
public class AnnoDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass("тест");

        System.out.println(obj.getMsg());
    }
}
