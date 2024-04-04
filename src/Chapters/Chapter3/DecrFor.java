package Chapters.Chapter3;
/*
 * Цикл for, выполняющийся с отрицательным приращением переменной
 */
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}
