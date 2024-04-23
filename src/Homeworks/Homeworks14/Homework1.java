package Homeworks.Homeworks14;
/**
 * Составьте лямбда-выражение, которое возвращает true,
 * если число принадлежит диапазону чисел 10-20,
 * включая граничные значения
 */
public class Homework1 {
    public static void main(String[] args) {
        MyTest b = (n) -> (n <= 20 && n >= 10);
    }
}
