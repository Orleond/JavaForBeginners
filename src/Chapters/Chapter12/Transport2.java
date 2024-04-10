package Chapters.Chapter12;
/*
 * Использование конструктора, переменной экземпляра и
 * метода перечисления
 */
public enum Transport2 {
    CAR(100),
    TRUCK(80),
    AIRPLANE(900),
    TRAIN(120),
    BOAT(35);

    private int speed;  // Типичная скорость транспортного средства

    // Конструктор
    Transport2(int s) { speed = s; }

    // Метода
    int getSpeed() { return speed; }
}
