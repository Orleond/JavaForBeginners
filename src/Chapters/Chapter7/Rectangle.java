package Chapters.Chapter7;
/*
 * Подкласс для представления прямоугольников,
 * производный от класса TwoDShape
 */
public class Rectangle extends TwoDShape {

    // Конструктор по умолчанию
    protected Rectangle() {
        super();
    }
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");   // Вызов конструктора суперкласса
    }

    // Создание квадрата
    protected Rectangle(double x) {
        super(x, "прямоугольник");  // Вызов конструктора суперкласса
    }

    // Создание одного объекта на основе другого
    Rectangle(Rectangle ob) {
        super(ob);  // Передача объекта конструктору класса TwoDShape
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    public double area() {
        return getWidth() * getHeight();
    }
}
