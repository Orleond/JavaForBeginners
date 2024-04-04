package Exercises.Exercises9;

/*
 * Расширение класса Vehicle для грузовиком
 */
public class Truck extends Vehicle {
    private int cargocap;   // Грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        // Инициализация членов класса Vehicle
        // с использованием конструктора этого класса
        super(p, f, m);

        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargocap() { return cargocap; }
    void setCargocap(int c) { cargocap = c; }
}
