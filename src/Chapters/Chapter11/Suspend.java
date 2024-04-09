package Chapters.Chapter11;
/*
 * Приостановка, возобновление и остановка потока
 */
public class Suspend {
    public static void main(String[] args) {
        MyThread6 mt1 = MyThread6.createAndStart("Мой поток");

        try {
            Thread.sleep(1000); // Позволить потоку mt1 начать выполнение

            mt1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Возобновление потока.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Остановка потокаю");
            mt1.mystop();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Выход из основного потока.");
    }
}
