package Chapters.Chapter11;
/*
 * Использование метода join()
 */
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        MyThread2 mt1 = MyThread2.createAndStart("Порожденный поток #1");
        MyThread2 mt2 = MyThread2.createAndStart("Порожденный поток #2");
        MyThread2 mt3 = MyThread2.createAndStart("Порожденный поток #3");

        try {
            mt1.thrd.join();
            System.out.println("Порожденный поток #1 - присоединен.");
            mt2.thrd.join();
            System.out.println("Порожденный поток #2 - присоединен.");
            mt3.thrd.join();
            System.out.println("Порожденный поток #3 - присоединен.");
        } catch (InterruptedException exc) {
            System.out.println("Прерываение основного потока.");
        }
        System.out.println("Завершение основного потока.");
    }
}
