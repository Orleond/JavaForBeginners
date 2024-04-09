package Chapters.Chapter11;
/*
 * Приостановка, возобновление и остановка потока
 */
public class MyThread6 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread6(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread6 createAndStart(String name) {
        MyThread6 myThrd = new MyThread6(name);

        myThrd.thrd.start();    // Запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Использование синхронизированного блока для
                // проверки значения переменных suspended и stopped
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван.");
        }
        System.out.println(thrd.getName() + " - выход.");
    }

    // Остановить поток
    synchronized void mystop() {
        stopped = true;

        // Следующие инструкции полностью останавливают
        // приостановленный поток
        suspended = false;
        notify();
    }

    // Приостановить поток
    synchronized void mysuspend() {
        suspended = true;
    }

    // Возобновить поток
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
