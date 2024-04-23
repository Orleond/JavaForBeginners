package Chapters.Chapter11;
/**
 * Использование методов wait() и notify() для имитации часов
 */
public class TickTock {
    String state;   // Содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { // Остановить часы
            state = "ticked";
            notify();   // Уведомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");

        state = "ticked";   // Установить текущее состояние
                            // после такта "тик"
        notify();   // Позволить выполняться методу tock()
        try {
            while (!state.equals("tocked"))
                wait(); // Ожидать до завершения метода tock()
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // Остановить часы
            state = "tocked";
            notify();   // Уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        state = "tocked";   // Установить текущее состояние
                            // после такта "так"
        notify();   // Позволить выполняться методу tick()
        try {
            while (!state.equals("ticked"))
                wait(); // Ожидать до завершения метода tick()
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}
