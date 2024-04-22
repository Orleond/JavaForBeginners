package Chapters.Chapter3;
/**
 * Демонстрация использования цикла while
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // вывод букв английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}
