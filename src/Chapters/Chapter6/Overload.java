package Chapters.Chapter6;
/**
 * Перегрузка методов
 */
public class Overload {
    void ovlDemo() {
        System.out.println("Без параметров");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) {
        System.out.println("Один параметр");
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) {
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }


    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " +
                a + " " + b);
        return a + b;
    }
}
