package Chapters.Chapter2;
/*
 * Приведение типов для правильного вычисления выражений
 */
public class UseCast {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 c дробной частью: " +
                    (double) i / 3);
            System.out.println();
        }
    }
}
