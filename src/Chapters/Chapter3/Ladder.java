package Chapters.Chapter3;
/*
 * Демонстрация использования многоступенчатой
 * конструкции if-else-if
 */
public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x равно 1");
            else if (x == 2)
                System.out.println("x равно 2");
            else if (x == 3)
                System.out.println("x равно 3");
            else if (x == 4)
                System.out.println("x равно 4");
            else
                // Условие, выполняемое по умолчанию
                System.out.println("Значение x находится вне диапазона 1-4");
        }
    }
}
