package SelfTests.SelfTests1;
/**
 * Вычисление веса на луне
 *
 * Присвойте этому файлу имя Moon.java
 */
public class Moon {
    public static void main(String[] args) {
        double earthweight; // Вес на Земле
        double moonweight;  // Вес на Луне

        earthweight = 165;  // Вес на Земле в фунтах

        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " земных фунтов" +
                " эквивалентны " + moonweight +
                " лунным фунтам.");
    }
}
