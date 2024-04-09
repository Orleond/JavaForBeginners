package Exercises.Exercises11;
/*
 * Упражнения 11.2
 * Управление основным потоком
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        // Получить основной поток
        thrd = Thread.currentThread();

        // Отобразить имя основного потока
        System.out.println("Имя основного потока: " + thrd.getName());

        // Отобразить приоритет основного потока
        System.out.println("Приоритет: " + thrd.getPriority());

        System.out.println();

        // Установить имя и приоритет основного потока
        System.out.println("Установка имени и приоритета\n");
        thrd.setName("Поток #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Новое имя основного потока: " + thrd.getName());
        System.out.println("Новое значение приоритета: " + thrd.getPriority());
    }
}
