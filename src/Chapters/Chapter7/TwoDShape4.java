package Chapters.Chapter7;

/**
 * Добавление дополнительных конструкторов в класс TwoDShape
 */
public class TwoDShape4 {
    private double width;
    private double height;

    // Конструктор, заданный по умолчанию
    protected TwoDShape4() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    protected TwoDShape4(double x) {
        width = height = x;
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
