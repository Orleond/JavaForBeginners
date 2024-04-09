package Homeworks.Homeworks11;
/*
 * Внесите в класс TickTock изменения для
 * организации фактического отсчета времени.
 * Первую половину секунды должен занимать вывод
 * на экран слова "Tick", а вторую - слова "Tock".
 * Таким образом, сообщение "Tick-Tock" должно
 * соответствовать одной секунде отсчитываемого
 * времени. (Время переключения контекстов можно не
 * учитывать).
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
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
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
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

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
