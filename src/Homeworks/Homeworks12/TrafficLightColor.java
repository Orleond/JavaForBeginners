package Homeworks.Homeworks12;
/*
 * Упражнение 12.1
 * Перечисление, представляющее цвета светофора
 */
public enum TrafficLightColor {
    RED(12000),
    GREEN(10000),
    YELLOW(2000);

    private int delay;

    TrafficLightColor(int delay) { this.delay = delay; }

    public int getDelay() { return delay; }
}
