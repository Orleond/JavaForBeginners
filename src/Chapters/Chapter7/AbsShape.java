package Chapters.Chapter7;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[4];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        for (TwoDShape shape : shapes) {
            System.out.println("Объект - " + shape.getName());
            System.out.println("Площадь - " + shape.area());
            shape.showDim();
            System.out.println();
        }
    }
}
