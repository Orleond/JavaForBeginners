package Homeworks.Homeworks12;
/**
 * Для перечисления Tools напишите
 * программу, в которой метод values() используется
 * для отображения списка констант и их значений.
 */
public class Homework1 {
    public static void main(String[] args) {
        for (Tools t: Tools.values())
            System.out.println(t.ordinal() + ". " + t);
    }
}
