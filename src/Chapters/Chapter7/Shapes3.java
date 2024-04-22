package Chapters.Chapter7;

/**
 * Добавление конструктора в класс Triangle
 */
public class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("закрашенный", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("контурный", 8.0, 12.0);

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
