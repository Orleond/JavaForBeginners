package Homeworks.Homeworks6;
/**
 * Напишите рекурсивный метод, отображающий строку
 * задом наперед
 */
public class Homework3 {
    static String recursion(String str, String newstr, int len) {
        if (len < 0) return "";
        newstr = Character.toString(str.charAt(len));
        len--;
        return newstr + recursion(str, newstr, len);
    }

    public static void main(String[] args) {
        System.out.println(recursion("Строка", "", 5));
    }
}
