package Chapters.Chapter14;
/**
 * Демонстрация использования ссылок на статические методы.
 */
public class MethodRefDemo {
    // В данном методе типом первого параметра является
    // функциональный интерфейс. Следовательно, ему можно передать
    // ссылку на любой экземпляр этого интерфейса, в том числе и на
    // экземпляр, созданный посредством ссылки на метод.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        // Здесь методу numTest() передается ссылка
        // на метод isPrime()
        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 - простое число");

        // Здесь методу numTest() передается ссылка
        // на метод isEven()
        result = numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 - четное число");

        // Здесь методу numTest() передается ссылка
        // на метод isPositive()
        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 - положительное число");


    }
}
