package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle2 extends TwoDShape2 {
    String style;

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
