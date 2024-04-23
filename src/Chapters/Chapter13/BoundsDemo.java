package Chapters.Chapter13;
/**
 * Демонстрация класса NumericFns
 */
public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("Обратная величина iOb - " + iOb.reciprocal());
        System.out.println("Дробная часть iOb - " + iOb.fraction());

        System.out.println();

        // Применение класса Double также допустимо
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);

        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
        System.out.println("Дробная часть dOb - " + dOb.fraction());

        // Следующая строка не будет компилироваться, так как
        // класс String не является производным от класса Number.
        // NumericFns<String> strOb = new NumericFns<String>("Ошибка");
    }
}
