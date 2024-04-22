package Chapters.Chapter2;
/**
 * С символьными переменными можно обращаться
 * как с целочисленными
 */
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;   // Инкрементировать переменную ch
        System.out.println("Теперь ch содержит " + ch);

        ch = 90;    // Присвоить переменной ch значение 'Z'
        System.out.println("Теперь ch содержит " + ch);
    }
}
