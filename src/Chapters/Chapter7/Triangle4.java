package Chapters.Chapter7;
/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle4 extends TwoDShape3 {
    private String style;

    Triangle4(String s, double w, double h) {
        super(w, h);    // Вызов конструктора суперкласса

        style = s;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
