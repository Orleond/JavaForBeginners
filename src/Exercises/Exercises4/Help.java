package Exercises.Exercises4;
/**
 * Упражнение 4.1
 * Преобразование в класс Help справочной системы
 * из упражнения 3.3
 */
public class Help {
    void helpOn(int what) {
        switch (what) {
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

    void showMenu() {
        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
        System.out.println("\t6. break");
        System.out.println("\t7. continue");
        System.out.print("Выберите (q - выход): ");
    }

    boolean isValid(int choice) {
        if (choice < '1' | choice > '7' & choice != 'q') return false;
        else return true;
    }
}
