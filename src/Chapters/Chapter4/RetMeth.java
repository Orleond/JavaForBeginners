package Chapters.Chapter4;
/*
 * Использование возвращаемого значения
 */
public class RetMeth {
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

        // Получение дальности поездки для разных
        // транспортных средств
        // ДЛЯ РАБОТЫ КОДА РАСКОММЕНТИТЬ ВЫВОД В КЛАССЕ Vehicle!
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " на расстояние " + range2 + " миль.");
    }
}
