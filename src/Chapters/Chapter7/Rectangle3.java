package Chapters.Chapter7;
/**
 * Подкласс для представления прямоугольников,
 * производный от класса TwoDShape
 */
public class Rectangle3 extends TwoDShape7 {
    // Конструктор по умолчанию
    protected Rectangle3() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle3(double w, double h) {
        super(w, h, "прямоугольник");   // Вызов конструктора суперкласса
    }

    // Создание квадрата
    protected Rectangle3(double x) {
        super(x, "прямоугольник");  // Вызов конструктора суперкласса
    }

    // Создание одного объекта на основе другого
    Rectangle3(Rectangle3 ob) {
        super(ob);  // Передача объекта конструктору класса TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    public double area() {
        return getWidth() * getHeight();
    }
}
