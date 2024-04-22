package SelfTests.SelfTests3;
/**
 * Подсчет пробелов
 */
public class Spaces {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spaces = 0;

        System.out.println("Для остановки введите символ точки.");

        do {
            ch = (char) System.in.read() ;
            if(ch == ' ') spaces++;
        } while(ch != '.');

        System.out.println("Пробелов: " + spaces);
    }
}
