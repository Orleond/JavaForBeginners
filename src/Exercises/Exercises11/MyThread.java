package Exercises.Exercises11;
/**
 * Упражнение 11.1
 * Расширение класса Thread
 */
public class MyThread extends Thread {
    // Конструктор нового потока
    MyThread(String name) {
        super(name);    // Имя потока
    }

    // Точка входа для потока
    public void run() {
        System.out.println(getName() + " - запуск.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " +
                        count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван.");
        }
        System.out.println(getName() + " - завершение.");
    }

    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.start();
        return myThrd;
    }
}
