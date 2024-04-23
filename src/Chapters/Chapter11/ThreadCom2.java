package Chapters.Chapter11;
/**
 * Использование методов wait() и notify() для имитации часов
 */
public class ThreadCom2 {
    public static void main(String[] args) {
        TickTock2 tt = new TickTock2();
        MyThread6 mt1 = MyThread6.createAndStart("Tick", tt);
        MyThread6 mt2 = MyThread6.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
