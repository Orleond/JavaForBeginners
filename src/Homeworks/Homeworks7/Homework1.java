package Homeworks.Homeworks7;
import Chapters.Chapter7.TwoDShape;
/*
 * Создайте подкласс Circle, производный от класса
 * TwoDShape. В нем дожен быть переопределен метод
 * area(), вычисляющий площадь круга,а а также
 * конструктор с ключевым словом super для
 * инициализации членов, унаследованных от класса
 * TwoDShape
 */
class Circle extends TwoDShape {

    protected Circle() {
        super();
    }
    protected Circle(double x) {
        super(x, "круг");
    }
    @Override
    public double area() {
        return (Math.PI * getWidth() * getWidth()) / 2;
    }
}
public class Homework1 {
    public static void main(String[] args) {

    }
}
