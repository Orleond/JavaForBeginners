package Chapters.Chapter3;
/*
 * Применение запятых в определении цикла for
 */
public class Comma {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i и j: " + i + " " + j);
    }
}
