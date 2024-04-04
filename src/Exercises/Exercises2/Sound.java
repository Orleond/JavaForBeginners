package Exercises.Exercises2;
/*
 * Упражнение 2.1
 * Вычисление расстояния до места вспышки молнии, звук от
 * которого доходит до наблюдателя через 7.2 секунды
 */
public class Sound {
    public static void main(String[] args) {
        double dist;

        dist = 1100 * 7.2 * 2;

        System.out.println("Расстояние, пройденное \"хлопком\" до скалы  " +
                "и обратно составляет " + dist + " футов");
    }
}
