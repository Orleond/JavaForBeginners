package Homeworks.Homeworks2;
/*
 * Покажите, каким образом укороченный логический оператор
 * И может предотвратить деление на нуль
 */
public class Homework1 {
    public static void main(String[] args) {
        int i = 2;
        if (false && (i % 0) == 0)
            System.out.println("Условие не выполниться");
        System.out.println("Деление на ноль не произошло");
    }
}
