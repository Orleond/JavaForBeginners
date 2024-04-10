package Chapters.Chapter12;
/*
 * Использование методов ordinal() т compareTo()
 */
public class EnunDemo4 {
    public static void main(String[] args) {
        Transport tp, tp2, tp3;

        // Получить порядковые значения с помощью метода ordinal()
        System.out.println("Константы перечисления Transport и их " +
                "порядковые значения: ");
        for (Transport t: Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        // Демонстрация использования метода compareTo()
        if (tp.compareTo(tp2) < 0)
            System.out.println(tp + " идет перед " + tp2);

        if (tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " идет перед " + tp);

        if (tp.compareTo(tp3) == 0)
            System.out.println(tp + " совпадает с " + tp3);
    }
}
