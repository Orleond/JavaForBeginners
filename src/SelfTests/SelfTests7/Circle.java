package SelfTests.SelfTests7;
/**
 * Подкласс для окружностей, производный от класса TwoDShape
 */
public class Circle extends TwoDShape7 {
    // Конструктор по умолчанию
    Circle() {
        super();
    }

    // Конструктор класса Circle
    Circle(double x) {
        super(x, "circle"); // Вызов конструктора суперкласса
    }

    // Создать новый объект из имеющегося объекта
    Circle(Circle ob) {
        super(ob);  // Передать объект конструктору класса TwoDShape
    }

    public double area() {
        return (getWidth() / 2 * (getWidth()) / 2) * 3.1416;
    }
}
