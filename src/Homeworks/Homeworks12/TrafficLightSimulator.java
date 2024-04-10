package Homeworks.Homeworks12;

/*
 * Упражнение 12.1
 * Автоматизированное управление светофором
 */
public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;  // Текущий цвет светофора
    boolean stop = false;   // Для остановки имитации установить в true
    boolean changed = false;    // true, если светофор переключился

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    // Запуск имитации автоматизированного светофора
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключение цвета светофора
    synchronized void changeColor() {
        if (tlc.ordinal() == (TrafficLightColor.values().length - 1))
            tlc = TrafficLightColor.values()[0];
        else
            tlc = TrafficLightColor.values()[tlc.ordinal() + 1];

        changed = true;

        notify();   // Уведомить о переключении светофора
    }

    // Ожидание переключения цвета светофора
    synchronized void waitForChange() {
        try {
            while (!changed)
                wait(); // Ожидать переключения цвета светофора
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Прекращение имитации светофора
    synchronized void cancel() {
        stop = true;
    }
}
