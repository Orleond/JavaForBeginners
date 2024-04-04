package Homeworks.Homeworks8;

/*
 * Упражнение 7.1
 * Создание подкласса Vehicle для грузовиков
 */
public class TruckDemo {
    public static void main(String[] args) {
        // Создание ряда новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " +
                semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist +
                " миль грузовику требуется " + gallons +
                " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " +
                pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist +
                " миль грузовику требуется " + gallons +
                " галлонов топлива.\n");
    }
}
