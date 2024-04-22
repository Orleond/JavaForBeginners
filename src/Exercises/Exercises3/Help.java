package Exercises.Exercises3;

import java.io.IOException;
/**
 * Упражнение 3.1
 * Простая справочная система
 */
public class Help {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.print("Выберите: ");
        choice = (char) System.in.read();

        System.out.println("");

        switch (choice) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if (условие) инструкция;");
                System.out.println("else инструкция");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println("\tcase константа:");
                System.out.println("\t\tпоследовательность инструкций");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
