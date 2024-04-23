package Homeworks.Homeworks11;
/**
 * Покажите, как с помощью метода join() можно
 * организовать ожидание завершения потокового
 * объекта MyThrd.
 */
public class MyThrd implements Runnable {
    @Override
    public void run() {
        System.out.println("Ну как-то так");
    }
}
