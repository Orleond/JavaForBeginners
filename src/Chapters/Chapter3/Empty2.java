package Chapters.Chapter3;
/**
 * Пропуск отдельных составляющих в определении цикла for
 */
public class Empty2 {
    public static void main(String[] args) {
        int i;
        i = 0;
        for (; i < 10;) {
            System.out.println("Проход #" + i);
            i++;
        }
    }
}
