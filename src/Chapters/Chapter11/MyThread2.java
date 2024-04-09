package Chapters.Chapter11;
/*
 * Изменения класса MyThread. Эта версия класса MyThread
 * создает объект Thread путем вызова его конструктора
 * и сохранения в переменной экземпляра thrd.
 * Также присваивается имя потоку и используется
 * фабричный метод создания и запуска потока.
 */
public class MyThread2 implements Runnable {
    Thread thrd;

    // Создание нового потока на основе интерфейса и
    // присваивание ему имени
    MyThread2(String name) {
        thrd = new Thread(this, name);
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread2 createAndStart(String name) {
        MyThread2 myThrd = new MyThread2(name);

        myThrd.thrd.start();    // Запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " +
                        count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");

    }
}
