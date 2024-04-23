package Homeworks.Homeworks14;
/**
 * Создайте блочное лямбда-выражение для вычисления
 * факториала целого числа. Продемонстрируйте его
 * использование. В качестве функционального
 * интерфейса используйте интерфейс NumericFunc,
 * который рассматривался в этой главе
 */
public class Homework3 {
    public static void main(String[] args) {
        NumericFunc fact = (n) -> {
            int sum = 1;
            for (int i = 1; i < n; i++) {
                sum *= i;
            }
            return sum;
        };
        System.out.println(fact.func(5));
        System.out.println(fact.func(15));
    }
}
