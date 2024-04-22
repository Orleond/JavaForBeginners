package Chapters.Chapter4;
/**
 * Добавление метода range() в класс Vehicle
 */
public class Vehicle2 {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    // Отображает дальность поездки транспортного средства
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }

}
