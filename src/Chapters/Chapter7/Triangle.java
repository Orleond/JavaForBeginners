package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape.
 */
class Triangle extends TwoDShape {
    String style;

    public double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}