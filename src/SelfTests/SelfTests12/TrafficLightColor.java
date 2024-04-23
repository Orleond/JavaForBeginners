package SelfTests.SelfTests12;
/**
 * Усовершенствованная версия программы, имитирующей
 * работу светофора. Значения задержки теперь хранятся
 * в классе TrafficLightColor.
 *
 * Перечисление, представляющее цвета светофора
 */
public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int d) {
        this.delay = d;
    }

    public int getDelay() { return delay; }
}
