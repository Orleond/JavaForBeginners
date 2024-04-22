package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle5 extends TwoDShape4 {
    private String style;

    // Конструктор по умолчанию
    Triangle5() {
        super();    // Вызов конструктора по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle5(String s, double w, double h) {
        super(w, h);    // Вызов конструктора суперкласса с
                        // двумя аргументами

        style = s;
    }

    // Конструктор с одним аргументом
    protected Triangle5(double x) {
        super(x);   // Вызов конструктора суперкласса
                    // с одним аргументом

        style = "закрашенный";
    }

    public double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
