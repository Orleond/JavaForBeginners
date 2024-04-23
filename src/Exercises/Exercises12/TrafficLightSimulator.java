package Exercises.Exercises12;
/**
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
                switch (tlc) {
                    case GREEN -> Thread.sleep(10000);  // Зеленый на 10 секунд
                    case YELLOW -> Thread.sleep(2000);  // Желтый на 2 секунды
                    case RED -> Thread.sleep(12000);    // Красный на 12 секунд
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключение цвета светофора
    synchronized void changeColor() {
        switch (tlc) {
            case RED -> tlc = TrafficLightColor.GREEN;
            case YELLOW -> tlc = TrafficLightColor.RED;
            case GREEN -> tlc = TrafficLightColor.YELLOW;
        }
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
