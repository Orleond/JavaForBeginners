package Chapters.Chapter7;
/**
 * Подкласс для представления прямоугольников,
 * производный от класса TwoDShape
 */
public class Rectangle2 extends TwoDShape6 {
    // Конструктор по умолчанию
    protected Rectangle2() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle2(double w, double h) {
        super(w, h, "прямоугольник");   // Вызов конструктора суперкласса
    }

    // Создание квадрата
    protected Rectangle2(double x) {
        super(x, "прямоугольник");  // Вызов конструктора суперкласса
    }

    // Создание одного объекта на основе другого
    Rectangle2(Rectangle2 ob) {
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
