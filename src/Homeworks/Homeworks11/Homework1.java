package Homeworks.Homeworks11;
/**
 * Покажите, как с помощью метода join() можно
 * организовать ожидание завершения потокового
 * объекта MyThrd.
 */
public class Homework1 {
    public static void main(String[] args) {
        MyThrd myThrd = new MyThrd();
        Thread t = new Thread(myThrd);

        try {
            myThrd.run();
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
