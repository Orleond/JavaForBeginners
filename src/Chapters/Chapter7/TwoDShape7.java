package Chapters.Chapter7;
/**
 * Создание абстрактного класса
 */
public abstract class TwoDShape7 {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    protected TwoDShape7() {
        width = height = 0.0;
        name = "none";
    }

    // Параметризированный конструктор
    TwoDShape7(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    protected TwoDShape7(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShape7(TwoDShape7 ob) {
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
    public abstract double area();
}
