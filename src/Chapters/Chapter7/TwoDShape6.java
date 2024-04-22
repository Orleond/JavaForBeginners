package Chapters.Chapter7;
/**
 * Использование динамической диспетчеризации методов
 */
public class TwoDShape6 {
    private double width;   // Теперь эти переменные
    private double height;  // объявлены как закрытые
    private String name;

    // Конструктор, заданный по умолчанию
    protected TwoDShape6() {
        width = height = 0.0;
        name = "none";
    }
    // Параметризированный конструктор
    TwoDShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    protected TwoDShape6(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к закрытым переменным экземпляра width и height
    protected double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " и " + height);
    }

    // Теперь метод area() абстрактный
    public double area();
}
