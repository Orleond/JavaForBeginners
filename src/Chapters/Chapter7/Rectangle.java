package Chapters.Chapter7;
/**
 * Подкласс для представления прямоугольников,
 * производный от класса TwoDShape
 */
public class Rectangle extends TwoDShape {

    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    public double area() {
        return width * height;
    }
}
