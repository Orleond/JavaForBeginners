package Exercises.Exercises1;
/*
 * Упражнение 1.1
 * Программа перевода галлонов в литры
 */
public class GalToLit {
    public static void main(String[] args) {
        double gallons; // В этой переменной хранится значение,
                        // выражающее объем жидкости в галлонах
        double liters;  // В этой переменной хранится значение,
                        // выражающее объем жидкости в литрах
        gallons = 10;   // Начальное значение соответствует 10 галлонам

        liters = gallons * 3.7854;  // Перевод в литры

        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
