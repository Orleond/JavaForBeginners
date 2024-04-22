package Homeworks.Homeworks6;
/**
 * Имеется класс Test. Напишите метод swap(),
 * реализующий обмен содержимым между двумя объектами
 * типа Test, на которые ссылаются две переменные
 * данного типа
 */
public class Test {
    int a;
    Test(int i) { a = i; }
    public void swap(Test t) {
        int tmp = t.a;
        t.a = this.a;
        this.a = tmp;
    }
}
