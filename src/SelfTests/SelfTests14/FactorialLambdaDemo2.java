package SelfTests.SelfTests14;
/**
 * Демонстрация использования блочного лямбда-выражения
 */
class FactorialLambdaDemo2 {
    public static void main(String[] args) {

        // Это блочное выражение вычисляет факториал
        // целочисленного значения
        MyFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("Факториал 3 равен " + factorial.func(3));
        System.out.println("Факториал 5 равен " + factorial.func(5));
        System.out.println("Факториал 9 равен " + factorial.func(9));
    }
}
