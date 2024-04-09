package Chapters.Chapter11;
/*
 * Использование синхронизированного блока
 * для управления доступом к SumArray
 */
public class Sync2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        MyThread4 mt1 = MyThread4.createAndStart("Порожденный поток #1", a);
        MyThread4 mt2 = MyThread4.createAndStart("Порожденный поток #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока.");
        }
    }
}
