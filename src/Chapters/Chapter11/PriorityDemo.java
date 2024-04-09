package Chapters.Chapter11;
/*
 * Демонстрация потоков с разными приоритетами
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("Высокий приоритет");
        Priority mt2 = new Priority("Низкий приоритет");
        Priority mt3 = new Priority("Обычный приоритет #1");
        Priority mt4 = new Priority("Обычный приоритет #2");
        Priority mt5 = new Priority("Обычный приоритет #3");

        // Присваивание приоритетов
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
        // Потоки mt3, mt4 и mt5 имеют обычный приоритет,
        // заданный по умолчанию

        // Запуск потоков
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерван основной потока.");
        }
        System.out.println("Счетчик потока с высоким приоритетом: " + mt1.count);
        System.out.println("Счетчик потока с низким приоритетом: " + mt2.count);
        System.out.println("Счетчик 1-го потока с обычным приоритетом: " + mt3.count);
        System.out.println("Счетчик 2-го потока с обычным приоритетом: " + mt4.count);
        System.out.println("Счетчик 3-го потока с обычным приоритетом: " + mt5.count);
    }
}
