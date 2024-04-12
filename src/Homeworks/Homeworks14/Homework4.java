package Homeworks.Homeworks14;
/*
 * Создайте обобщенный функциональный интерфейс
 * MyFunc<T>. Назовите его абстрактный метод func().
 * Метод func() должен иметь параметр типа T и
 * возвращать ссылку типа Т. (Таким образом
 * интерфейс MyFunc должен представлять собой
 * обобщенную версию интерфейса NumericFunc,
 * который рассматривался в этой главе).
 * Продемонстрируйте его использование, переработав
 * свое решение для Homework3 таким образом, чтобы
 * вместо интерфейса NumericFunc в нем использовался
 * интерфейс MyFunc<T>
 */
public class Homework4 {
    public static void main(String[] args) {
        MyFunc<Integer> fact = (n) -> {
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
