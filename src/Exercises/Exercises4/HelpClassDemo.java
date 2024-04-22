package Exercises.Exercises4;

import java.io.IOException;
/**
 * Упражнение 4.1
 * Преобразование в класс Help справочной системы
 * из упражнения 3.3
 */
public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        Help helpObj = new Help();
        for (;;) {
            do {
                helpObj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpObj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("");
            helpObj.helpOn(choice);
        }
    }
}
