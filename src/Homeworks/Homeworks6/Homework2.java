package Homeworks.Homeworks6;
/**
 * Имеется класс Test. Напишите метод swap(),
 * реализующий обмен содержимым между двумя объектами
 * типа Test, на которые ссылаются две переменные
 * данного типа
 */
public class Homework2 {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        System.out.println(t1.a);
        System.out.println(t2.a);
        t1.swap(t2);
        System.out.println(t1.a);
        System.out.println(t2.a);
    }

}
