package Chapters.Chapter7;
/**
 * Создание абстрактного класса
 */
public class AbsShape {
    public static void main(String[] args) {
        TwoDShape7[] shapes = new TwoDShape7[4];

        shapes[0] = new Triangle8("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle3(10);
        shapes[2] = new Rectangle3(10, 4);
        shapes[3] = new Triangle8(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}
