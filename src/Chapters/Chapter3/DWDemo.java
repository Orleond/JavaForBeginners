package Chapters.Chapter3;

import java.io.IOException;

/*
 * Демонстрация использования цикла do-while
 */
public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
            System.out.print("Нажмите нужную клавишу, а затем " +
                    "клавишу ENTER: ");
            ch = (char) System.in.read(); // Чтение символа с клавиатуры
        } while (ch != 'q');
    }
}
