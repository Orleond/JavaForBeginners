package Chapters.Chapter4;

public class Vehicle3 {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    // Возврат дальности поездки
    int range() {
        return mpg * fuelcap;
    }
}
