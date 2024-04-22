package Exercises.Exercises3;

import java.io.IOException;
/**
 * Упражнение 3.3
 * Завершенная справочная система по управляющим
 * инструкциям Java, обрабатывающая многократные запросы
 */
public class Help3 {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        for (;;) {
            do {
                System.out.println("Справка:");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do-while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue");
                System.out.print("Выберите (q - выход): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

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
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.println("for (инициализация; условие; итерация)");
                    System.out.println("\tинструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while (условие) инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("\tинструкция;");
                    System.out.println("} while (условие);");
                    break;
                case '6':
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Инструкция continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;
            }
            System.out.println();
        }

    }
}
