package SelfTests.SelfTests12;
/**
 * Усовершенствованная версия программы, имитирующей
 * работу светофора. Значения задержки теперь хранятся
 * в классе TrafficLightColor.
 */
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 =
                new TrafficLightSimulator(TrafficLightColor.GREEN);

        Thread thrd = new Thread(t1);
        thrd.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
