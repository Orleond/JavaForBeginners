package Chapters.Chapter7;
/**
 * Использование динамической диспетчеризации методов
 */
public class DynShapes {
    public static void main(String[] args) {
        TwoDShape6[] shapes = new TwoDShape6[5];

        shapes[0] = new Triangle7("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle7(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}
