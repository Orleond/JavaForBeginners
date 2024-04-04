package Chapters.Chapter4;
/*
 * Класс, предназначенный для тестирования другими классами
 */

public class Vehicle {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    Vehicle() { }

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Отображает дальность поездки транспортного средства
    // Определение дальности поездки транспортного средства
    int range() {
        // System.out.println("Дальность - " + fuelcap * mpg + " миль.");
        return mpg * fuelcap;
    }

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
