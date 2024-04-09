package Chapters.Chapter11;
/*
 * Создание нескольких потоков
 */
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        MyThread2 mt1 = MyThread2.createAndStart("Порожденный поток #1");
        MyThread2 mt2 = MyThread2.createAndStart("Порожденный поток #2");
        MyThread2 mt3 = MyThread2.createAndStart("Порожденный поток #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}
