package Chapters.Chapter13;
/**
 * Пример обобщенного интерфейса
 */
public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] x = { 1, 2, 3 };

        MyClass<Integer> ob = new MyClass<>(x);

        if (ob.contains(2))
            System.out.println("2 содержится в ob");
        else
            System.out.println("2 НЕ содержится в ob");

        if (ob.contains(5))
            System.out.println("5 содержится в ob");
        else
            System.out.println("5 НЕ содержится в ob");

        // Следующие строки кода недопустимы, так как объект ob
        // является вариантом реализации интерфейса Containment для
        // типа Integer, а значение 9.25 относится к типу Double
        // if (ob.contains(9.25)) // Недопустимо!
        //      System.out.println("9.25 не содержится в ob");

    }
}
