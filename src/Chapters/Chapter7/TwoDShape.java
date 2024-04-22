package Chapters.Chapter7;
/*
 * Класс, описывающий двумерные объекты.
 */
public abstract class TwoDShape {
    double width;
    double height;
    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " +
                height);
    }

    // Теперь метод area() абстрактный
    public abstract double area();
}
