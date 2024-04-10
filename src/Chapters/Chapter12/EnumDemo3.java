package Chapters.Chapter12;
/*
 * Использование конструктора, переменной экземпляра и
 * метода перечисления
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        Transport2 tp;

        // Отобразить скорость самолета
        System.out.println("Типичная скорость самолета: " +
                Transport2.AIRPLANE.getSpeed() +
                " км в час\n");

        // Отобразить все виды транспорта и скорости их передвижения
        System.out.println("Типичные скорости передвижения транспортных средств");
        for (Transport2 t: Transport2.values())
            System.out.println(t + ": " + t.getSpeed() + " км в час");
    }
}
