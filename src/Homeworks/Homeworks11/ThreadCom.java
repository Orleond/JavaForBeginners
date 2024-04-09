package Homeworks.Homeworks11;
/*
 * Использование методов wait() и notify() для имитации часов
 */
public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread5 mt1 = MyThread5.createAndStart("Tick", tt);
        MyThread5 mt2 = MyThread5.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
