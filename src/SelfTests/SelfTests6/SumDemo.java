package SelfTests.SelfTests6;
/**
 * Суммирование переданных чисел
 */
public class SumDemo {
    public static void main(String[] args) {
        SumIt siObj = new SumIt();

        int total = siObj.sum(1, 2, 3);
        System.out.println("Сумма; " + total);

        total = siObj.sum(1, 2, 3, 4, 5);
        System.out.println("Сумма: " + total);
    }
}
