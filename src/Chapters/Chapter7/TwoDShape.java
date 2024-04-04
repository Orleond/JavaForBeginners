package Chapters.Chapter7;
/*
 * Класс, описывающий двумерные объекты.
 * Добавление конструкторов в класс TwoDShape.
 * Использование динамической диспетчеризации методов.
 * Создание абстрактного класса
 */
public abstract class TwoDShape {
    private double width;   // Теперь эти переменные
    private double height;  // объявлены как закрытые
    private String name;

    // Конструктор, заданный по умолчанию
    protected TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
    // Параметризированный конструктор
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    protected TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShape(TwoDShape ob) {
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
