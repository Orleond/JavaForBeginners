package Chapters.Chapter4;
/**
 * Добавление метода range() в класс Vehicle
 */
public class AddMeth {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.print("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();    // Отображение информации о дальности
                            // поездки мини-фургона

        System.out.print("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " пассажиров. ");
        sportcar.range();    // Отображение информации о дальности
                            // поездки спортивного автомобиля

    }
}
