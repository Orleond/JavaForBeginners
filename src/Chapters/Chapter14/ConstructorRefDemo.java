package Chapters.Chapter14;
/*
 * Демонстрация использования ссылок на конструкторы
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass.
        // Поскольку метод func() интерфейса MyFunc
        // имеет аргумент, new ссылается на параметризованный
        // конструктор MyClass, а не на конструктор по умолчанию
        MyFunc2 myClassCons = MyClass2::new;

        // Создать экземпляр MyClass посредством
        // ссылки на конструктор
        MyClass2 mc = myClassCons.func("Тестирования");

        // Использовать только что созданный экземпляр MyClass
        System.out.println("Строка str в mc: " + mc.getStr());
    }
}
