package Chapters.Chapter14;
/*
 * Демонстрация использования ссылок на конструкторы
 */
public class MyClass2 {
    private String str;

    // Этот конструктор имеет аргумент
    MyClass2(String s) { str = s; }

    // Это конструктор по умолчанию
    MyClass2() { str = ""; }

    // ...

    String getStr() { return str; }
}
