package Homeworks.Homeworks3;

import java.io.IOException;

/*
 * Коды ASCII-символов нижнего регистра отличаются от
 * кодов соответствующих символов верхнего регистра на
 * величину 32. Следовательно, для преобразования строчной
 * буквы в прописную нужно уменьшить ее код на 32. Используйте
 * это обстоятельство для написания программы, читающей
 * символы с клавиатуры. При выводе результатов данная
 * программа должна преобразовывать строчные буквы в
 * прописные, а прописные - в строчные. Останьные символы
 * не должны меняться. Работа программы должна завершаться
 * после того, как пользователь введет с клавиатуры точку.
 * И, наконец, сделайте так, чтобы программа отображала
 * количество символов, для которых был изменен регистр.
 */
public class Homework4 {
    public static void main(String[] args) throws IOException {
        char ch;
        int counter = 0;
        for (;;) {
            ch = (char) System.in.read();
            if (ch == '.') break;
            if (ch >= 'a' && ch <= 'z') {
                System.out.println((char)(ch - 32));
                counter++;
            } else if (ch >= 'A' && ch >= 'Z') {
                System.out.println((char)(ch + 32));
                counter++;
            }
        }
        System.out.println("Преобразовано " + counter + " символов");
    }
}
