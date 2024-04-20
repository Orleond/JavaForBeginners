package Chapters.Chapter4;
/*
 * Добавление конструктора
 */
public class VehConsDemo {
    public static void main(String[] args) {
        // Завершение создания объектов транспортных средств
        Vehicle5 minivan = new Vehicle5(7, 16, 21);
        Vehicle5 sportcar = new Vehicle5(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");
    }
}
