package Chapters.Chapter7;
/*
 * Подкласс для представления треугольников,
 * производный от класса TwoDShape.
 * Добавление конструктора в класс Triangle
 */
class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    protected Triangle() {
        super();    // Вызов конструктора по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");    // Вызов конструктора суперкласса
        style = s;
    }

    protected Triangle(double x) {
        super(x, "треугольник");   // Вызов конструктора суперкласса
                    // с одним аргументом
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle(Triangle ob) {
        super(ob);  // Передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}