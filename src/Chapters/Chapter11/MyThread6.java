package Chapters.Chapter11;
/**
 * Использование методов wait() и notify() для имитации часов
 */
public class MyThread6 implements  Runnable {
    Thread thrd;
    TickTock2 ttOb;

    // Конструктор нового потока
    MyThread6(String name, TickTock2 tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread6 createAndStart(String name, TickTock2 tt) {
        MyThread6 myThrd = new MyThread6(name, tt);
        myThrd.thrd.start();    // Запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
            }
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
            }
            ttOb.tock(false);
        }
    }
}
