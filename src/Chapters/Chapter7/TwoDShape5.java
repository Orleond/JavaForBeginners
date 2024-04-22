package Chapters.Chapter7;
/**
 * Добавление конструктора, принимающего в качестве параметра
 * другой объект TwoDShape
 */
public class TwoDShape5 {
    private double width;
    private double height;

    // Конструктор, заданный по умолчанию
    protected TwoDShape5() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    protected TwoDShape5(double x) {
        width = height = x;
    }

    // Создание одного объекта на основе другого
    TwoDShape5(TwoDShape5 ob) {
        width = ob.width;
        height = ob.height;
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
