package SelfTests.SelfTests8;
/**
 * Создание подкласса класса Vehicle для грузовиков
 */
public class Vehicle implements IVehicle {
    private int passengers; // Количество пассажиров
    private int fuelcap;    // Емкость топливного бака в галлонах
    private int mpg;        // Потребность топлива в милях на галлон

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Дальность поездки транспортного средства
    public int range() {
        return mpg * fuelcap;
    }

    // Вычисление объема топлива, требуемого
    // для прохождения заданного пути
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    public int getPassengers() { return passengers; }
    public void setPassengers(int p) { passengers = p; }
    public int getFuelcap() { return fuelcap; }
    public void setFuelcap(int f) { fuelcap = f; }
    public int getMpg() { return mpg; }
    public void setMpg(int m) { mpg = m; }
}
