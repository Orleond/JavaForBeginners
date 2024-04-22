package Chapters.Chapter7;

/**
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape
 */
public class Triangle3 extends TwoDShape2 {
    private String style;

    // Конструктор
    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
