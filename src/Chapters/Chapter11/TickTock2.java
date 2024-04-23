package Chapters.Chapter11;
/**
 * В этой версии вызовы методов wait() и notify() отсутствуют
 */
public class TickTock2 {
    String state;   // Содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { // Остановить часы
            state = "ticked";
            return;
        }

        System.out.print("Tick ");

        state = "ticked";   // Установить текущее состояние
                            // после такта "тик"
    }

    synchronized void tock(boolean running) {
        if (!running) { // Остановить часы
            state = "tocked";
            return;
        }

        System.out.println("Tock");

        state = "tocked";   // Установить текущее состояние
                            // после такта "так"
    }
}
