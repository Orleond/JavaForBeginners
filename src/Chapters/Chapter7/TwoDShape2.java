package Chapters.Chapter7;
/**
 * Класс, описывающий двумерные объекты.
 */
public abstract class TwoDShape2 {
    private double width;   // Теперь эти переменные
    private double height;  // объявлены как закрытые

    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " +
                height);
    }

    // Теперь метод area() абстрактный
    public abstract double area();
}
