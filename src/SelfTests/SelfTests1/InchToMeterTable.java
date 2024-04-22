package SelfTests.SelfTests1;
/**
 * Эта программа отображает таблицу преобразования дюймов в метры.
 *
 * Присвойте этому файлу имя InchToMeterTable.java
 */
public class InchToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144 ; inches++) {
            meters = inches * 39.37;    // Преобразование в метры
            System.out.println(inches + " дюймов равно " +
                    meters + " метров.");

            counter++;
            // Каждая 12-я выводимая строка должна быть пустой
            if (counter == 12) {
                System.out.println();
                counter = 0;    // Сбросить счетчик строк
            }
        }
    }
}
