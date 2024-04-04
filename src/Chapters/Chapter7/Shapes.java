package Chapters.Chapter7;
/*
 * Простая иерархия классов
 *
 * Использование методов доступа для установки и
 * получения значений закрытых членов.
 *
 * СОДЕРЖИТ В ОДНОМ КЛАССЕ ВСЕ SHAPES 1-5
 */

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());
    }
}
