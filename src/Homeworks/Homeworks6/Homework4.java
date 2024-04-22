package Homeworks.Homeworks6;
/**
 * Создайте метод sum(), имеющий список аргументов
 * переменной длины и предназначенный для суммирования
 * передаваемых ему значений типа int. Метод должен
 * возвращать результат суммирования. Продемонстрируйте
 * работу этого метода
 */
public class Homework4 {
    static int sum(int ... args) {
        int sum = 0;
        for (int i: args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 4, 5, 3));
    }
}
