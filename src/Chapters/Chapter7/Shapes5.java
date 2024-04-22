package Chapters.Chapter7;
/**
 * Добавление дополнительных конструкторов в класс TwoDShape
 */
public class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5();
        Triangle5 t2 = new Triangle5("контурный", 8.0, 12.0);
        Triangle5 t3 = new Triangle5(4.0);

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
