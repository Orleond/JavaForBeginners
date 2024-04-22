package Homeworks.Homeworks7;
/**
 * Создайте подкласс Circle, производный от класса
 * TwoDShape. В нем должен быть переопределен метод
 * area(), вычисляющий площадь круга, а также
 * конструктор с ключевым словом super для
 * инициализации членов, унаследованных от класса
 * TwoDShape
 */
class Circle extends TwoDShape7 {

    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "круг");
    }

    Circle(Circle c) {
        super(c);
    }

    @Override
    public double area() {
        return (Math.PI * getWidth() * getWidth()) / 2;
    }
}
