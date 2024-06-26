package Chapters.Chapter4;
/**
 * Добавление параметризированного метода, в котором
 * выполняется расчет объема топлива, необходимого
 * транспортному средству для преодоления заданного
 * расстояния
 */
public class Vehicle4 {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    // Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
