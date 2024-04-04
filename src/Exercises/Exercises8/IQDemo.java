package Exercises.Exercises8;
/*
 * Демонстрация трех реализаций интерфейса ICharQ
 */
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);


        ICharQ iQ;

        char ch;

        iQ = q1;
        // Помещение ряда символов в очередь фиксированного рамера
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        // Отображение содержимого очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Помещение ряда символов в динамическую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        // Отображение содержимого очереди
        System.out.print("Содержимое динамической очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // Помещение ряда символов в кольцевую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Помещение дополнительных символов в кольцевую очередь
        for (int i = 0; i < 20; i++) {
            iQ.put((char)('A' + i));
        }

        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использовании данных " +
                "кольцевой очереди.");

        // Помещение символов в кольцевую очередь с
        // последующим их извлечением
        for (int i = 0; i < 20; i++) {
            iQ.put((char)('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
