package Chapters.Chapter11;
/**
 * Использование ключевого слова synchronized для
 * управления доступом
 */
public class MyThread3 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Конструктор нового потока
    MyThread3(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread3 createAndStart(String name, int[] nums) {
        MyThread3 myThrd = new MyThread3(name, nums);

        myThrd.thrd.start();    // Запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск.");

        answer = sa.sumArray(a);
        System.out.println("Сумма для " + thrd.getName() +
                " Будет " + answer);

        System.out.println(thrd.getName() + " - завершение.");
    }
}
