package Chapters.Chapter4;

public class Vehicle2 {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // Потребность топлива в милях на галлон

    Vehicle2() { }

    // Это конструктор класса Vehicle
    Vehicle2(int p, int f, int m) {
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
