package Chapters.Chapter4;
/**
 * Добавление параметризированного метода, в котором
 * выполняется расчет объема топлива, необходимого
 * транспортному средству для преодоления заданного
 * расстояния
 */
public class CompFuel {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportcar = new Vehicle4();
        double gallons;
        int dist = 252;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

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
