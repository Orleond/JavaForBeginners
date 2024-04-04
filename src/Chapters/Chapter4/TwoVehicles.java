package Chapters.Chapter4;
/*
 * В этой программе создаются два объекта класса Vehicle
 */
public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        // Расчет дальности поездки с полным баком горючего
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " +
                range1 + " миль");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " пассажиров на расстояние " +
                range2 + " миль");
    }
}
