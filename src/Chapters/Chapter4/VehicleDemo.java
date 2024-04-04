package Chapters.Chapter4;
/*
 * Программа, в которой используетс класс Vehicle
 */

// В этом классе объявляется объект типа Vehicle
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // Присваивание значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " +
                range + " миль");
    }
}