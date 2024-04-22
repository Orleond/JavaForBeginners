package Chapters.Chapter7;
/**
 * Добавление конструкторов, принимающих в качестве параметра
 * другие объекты
 */
public class Shapes7 {
    public static void main(String[] args) {
        Triangle6 t1 = new Triangle6("контурный", 8.0, 12.0);

        // Создать копию объекта t1
        Triangle6 t2 = new Triangle6(t1);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}
