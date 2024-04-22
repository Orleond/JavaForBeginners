package Chapters.Chapter7;

/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle6 extends TwoDShape5 {
    private String style;

    // Конструктор по умолчанию
    Triangle6() {
        super();    // Вызов конструктора по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle6(String s, double w, double h) {
        super(w, h);    // Вызов конструктора суперкласса с
        // двумя аргументами

        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    protected Triangle6(double x) {
        super(x);   // Вызов конструктора суперкласса

        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle6(Triangle6 ob) {
        super(ob);  // Передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
