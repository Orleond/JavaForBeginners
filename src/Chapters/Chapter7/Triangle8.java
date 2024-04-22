package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle8 extends TwoDShape7 {
    private String style;

    // Конструктор по умолчанию
    Triangle8() {
        super();    // Вызов конструктора по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle8(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    protected Triangle8(double x) {
        super(x, "треугольник");   // Вызов конструктора суперкласса
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle8(Triangle8 ob) {
        super(ob);  // Передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
