package SelfTests.SelfTests13;
/**
 * Демонстрация использования класса GenStack
 */
public class GenStackDemo {
    public static void main(String[] args) {
        // Создать пустой стек на 10 элементов типа Integer
        Integer[] iStore = new Integer[10];
        GenStack<Integer> stk1 = new GenStack<Integer>(iStore);

        // Создать стек из массива
        String[] name = { "Один", "Два", "три" };
        String[] strStore = new String[3];
        GenStack<String> stk2 = new GenStack<String>(strStore, name);

        String str;
        int n;

        try {
            // Занести ряд значений в стек stk1
            for (int i = 0; i < 10; i++)
                stk1.push(i);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        // Создать один стек на основе другого стека
        String[] strStore2 = new String[3];
        GenStack<String> stk3 = new GenStack<String>(strStore2, stk2);

        try {
            // Отобразить стеки
            System.out.print("Содержимое stk1: ");
            for (int i = 0; i < 10; i++) {
                n = stk1.pop();
                System.out.print(n + " ");
            }

            System.out.println("\n");

            System.out.print("Содержимое stk2: ");
            for (int i = 0; i < 3; i++) {
                str = stk2.pop();
                System.out.print(str + " ");
            }

            System.out.println("\n");

            System.out.print("Содержимое stk3: ");
            for (int i = 0; i < 3; i++) {
                str = stk3.pop();
                System.out.print(str + " ");
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
    }
}
