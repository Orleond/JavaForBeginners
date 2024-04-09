package Homeworks.Homeworks11;
/*
 * Использование методов wait() и notify() для имитации часов
 */
public class MyThread5 implements  Runnable {
    Thread thrd;
    TickTock ttOb;

    // Конструктор нового потока
    MyThread5(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread5 createAndStart(String name, TickTock tt) {
        MyThread5 myThrd = new MyThread5(name, tt);
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
