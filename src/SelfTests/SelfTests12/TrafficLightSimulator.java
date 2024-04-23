package SelfTests.SelfTests12;
/**
 * Усовершенствованная версия программы, имитирующей
 * работу светофора. Значения задержки теперь хранятся
 * в классе TrafficLightColor.
 *
 * Имитация автоматизированного светофора
 */
class TrafficLightSimulator implements Runnable {
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
            // По сравнению с предыдущей версией программы
            // код значительно упростился!
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
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
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
