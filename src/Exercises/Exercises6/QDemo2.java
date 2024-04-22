package Exercises.Exercises6;
/**
 * Упражнение 6.2
 * Демонстрация использования класса Queue
 */
public class QDemo2 {
    public static void main(String[] args) {
        // Создание пустой очереди для хранения 10 элементов
        Queue q1 = new Queue(10);

        char[] name = {'T', 'o', 'm'};
        // Создание очереди на основе массива
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Помещение ряда символов в очередь q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Создание одной очереди на основе другой
        Queue q3 = new Queue(q1);

        // Отображение очередей
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        // Отображение очередей
        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        // Отображение очередей
        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println("\n");


    }
}
