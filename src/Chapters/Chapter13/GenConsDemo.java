package Chapters.Chapter13;
/**
 * Использование обобщенного конструктора
 */
public class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);
        System.out.println("Сумма целых чисел от 0 до 4.0 равна " +
                ob.getSum());
    }
}
