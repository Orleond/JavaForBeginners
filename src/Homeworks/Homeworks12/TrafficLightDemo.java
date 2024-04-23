package Homeworks.Homeworks12;
/**
 * Созданную в упражнении 12.1 программу,
 * имитирующую автоматизированный светофор, можно
 * усовершенствовать, внеся ряд простых изменений,
 * позволяющих выгодно воспользоваться возможностями
 * перечислений. В исходной версии этой программы
 * продолжительность отображения каждого цвета
 * светофора задавалась константами перечислимого
 * типа TrafficLightColor. Для этого вам понадобятся
 * конструктор, переменная экземпляра, объявленная
 * как private, и метод getDelay(). Подумайте о том,
 * как еще можно улучшить данную программу. (Подсказка:
 * попробуйте отказаться от инструкции switch и
 * воспользоваться порядковыми значениями каждого
 * для переключения светофора.)
 */
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for (int i = 0; i < 3; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
