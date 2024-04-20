package Chapters.Chapter4;

public class Vehicle5 {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    // Это конструктор класса Vehicle
    Vehicle5(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

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
