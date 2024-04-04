package Homeworks.Homeworks1;
/*
 * Сила тяжести на Луне составляет около 17% земной.
 * Напишите прогграмму, которая вычисляла бы ваш вес
 * на Луне.
 */
public class Homework1 {
    public static void main(String[] args) {
        double weightEarth = 88.5;
        double weightMoon;
        weightMoon = weightEarth * 0.17;
        System.out.println(weightEarth + " кг на земле ровняются " +
                weightMoon + " кг на Луне.");
    }
}
