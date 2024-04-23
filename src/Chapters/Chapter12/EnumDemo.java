package Chapters.Chapter12;
/**
 * Использование перечисления Transport
 */
public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        // Отобразить перечислимое значение
        System.out.println("Значение tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Сравнить два перечислимых значения
        if (tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN\n");

        // Использование перечислений для управления
        // инструкцией switch
        switch (tp) {
            case CAR -> System.out.println("Автомобиль везет людей");
            case TRUCK -> System.out.println("Грузовик перевозит груз");
            case AIRPLANE -> System.out.println("Самолет летит");
            case TRAIN -> System.out.println("Поезд движется по рельсам");
            case BOAT -> System.out.println("Лодка плывет по реке");
        }
    }
}
