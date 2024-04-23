package Chapters.Chapter11;
/**
 * Использование синхронизированного блока
 * для управления доступом к SumArray
 */
public class MyThread4 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Конструктор нового потока
    MyThread4(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread4 createAndStart(String name, int[] nums) {
        MyThread4 myThrd = new MyThread4(name, nums);

        myThrd.thrd.start();    // Запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск.");

        // Синхронизация вызова sumArray()
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Сумма для " + thrd.getName() +
                " Будет " + answer);

        System.out.println(thrd.getName() + " - завершение.");
    }
}
