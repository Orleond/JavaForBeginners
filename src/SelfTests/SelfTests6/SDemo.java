package SelfTests.SelfTests6;

/**
 * Демонстрация использования класса Stack
 */
public class SDemo {
    public static void main(String args[]) {
        // создать пустой стек на 10 элементов
        Stack stkl = new Stack(10);

        char[] name = { 'T', 'o', 'm'};

        // создать стек из массива
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        // поместить символы в стек stk1
        for(i=0; i < 10; i++)
            stkl.push((char) ('A' + i) ) ;

        // создать один стек из другого стека
        Stack stk3 = new Stack(stkl);

        // отобразить стеки
        System.out.print("Содержимое stkl: ");
        for(i=0; i < 10; i++) {
            ch = stkl.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое stk2: ");
        for(i=0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое stk3: ");
        for(i=0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
