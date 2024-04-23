package Homeworks.Homeworks14;
/**
 * Используя программу, созданную в упражнении 14.1,
 * создайте лямбда-выражение, которое удаляет все
 * пробелы из заданной строки и возвращает результат.
 * Продемонстрируйте работу этого метода, передав
 * его методу changeStr().
 */
public class Homework5 {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("Обращенная строка: " + outStr);

    }
}
