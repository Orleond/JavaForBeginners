package Chapters.Chapter6;
/**
 * Применение статического блока
 */
public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен " + StaticBlock.rootOf2);
        System.out.println("Корень квадратный из 3 равен " + StaticBlock.rootOf3);
    }
}
