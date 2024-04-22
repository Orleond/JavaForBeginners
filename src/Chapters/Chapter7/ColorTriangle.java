package Chapters.Chapter7;
/*
 * Расширение класса Triangle
 */
public class ColorTriangle extends Triangle5 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }
    void showColor() {
        System.out.println("Цвет - " + color);
    }
}
