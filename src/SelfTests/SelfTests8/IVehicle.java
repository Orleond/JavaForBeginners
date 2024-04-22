package SelfTests.SelfTests8;
/**
 * Интерфейс для класса Vehicle
 */
public interface IVehicle {

    // Вернуть дальность поездки транспортного средства
    int range();

    // Вычислить объем топлива, требующегося
    // для прохождения заданного пути
    double fuelneeded(int miles);

    // Методы доступа к переменным экземпляра
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
