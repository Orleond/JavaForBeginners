package Homeworks.Homeworks1;
/**
 * Видоизмените программу, созданную в упражнении 1.2,
 * таким образом, чтобы она выводила таблицу перевода
 * дюймов в метры. Выведите значения длины до 12 футов
 * через каждый дюйм. После каждых 12 дюймов выведите
 * пустую строку. (Один метр приблизительно равен 39.37 дюймам.)
 */
public class Homework2 {
    public static void main(String[] args) {
        int inches, foots;
        double meters;

        for (foots = 0, inches = 1; foots < 12; inches++) {
            meters = (foots * 12 + inches) / 39.37;
            if (inches == 12) {
                foots++;
                inches = 0;
            }
            if (inches == 1 && foots != 0)
                System.out.println();
            System.out.println(foots + " футов " + inches + " дюймов равно " +
                    meters + " метров.");
        }

    }
}
