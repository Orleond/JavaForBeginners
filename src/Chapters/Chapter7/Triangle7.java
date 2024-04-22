package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle7 extends TwoDShape6 {
    private String style;

    // Конструктор по умолчанию
    Triangle7() {
        super();    // Вызов конструктора по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle7(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    protected Triangle7(double x) {
        super(x, "треугольник");   // Вызов конструктора суперкласса
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle7(Triangle7 ob) {
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
