package Chapters.Chapter7;
/**
 * Добавление конструкторов в класс TwoDShape
 */
public class TwoDShape3 {
    private double width;
    private double height;

    // Параметризированный конструктор
    TwoDShape3(double w, double h) {
        width = w;
        height = h;
    }

    // Методы доступа к закрытым переменным экземпляра width и height
    protected double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " и " + height);
    }
}
