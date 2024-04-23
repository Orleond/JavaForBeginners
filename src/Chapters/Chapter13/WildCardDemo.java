package Chapters.Chapter13;
/**
 * Демонстрация использования шаблона аргумента
 */
public class WildCardDemo {
    public static void main(String[] args) {
        NumericFns2<Integer> iOb = new NumericFns2<>(6);
        NumericFns2<Double> dOb = new NumericFns2<>(-6.0);
        NumericFns2<Long> lOb = new NumericFns2<>(5L);

        System.out.println("Сравнение iOb и dOb");
        if (iOb.absEqual(dOb))
            System.out.println("Абсолютные значения совпадают");
        else
            System.out.println("Абсолютные значения отличаются");

        System.out.println();

        System.out.println("Сравнение iOb и lOb.");
        if (iOb.absEqual(lOb))
            System.out.println("Абсолютные значения совпадают");
        else
            System.out.println("Абсолютные значения отличаются");
    }
}
