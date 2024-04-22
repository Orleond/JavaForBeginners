package Chapters.Chapter7;
/**
 * Обращение к объекту подкласса по ссылочной
 * переменой суперкласса
 */
public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x;     // Допустимо, поскольку обе переменные одного типа
        System.out.println("x2.a: " + x2.a);

        x2 = y; // По-прежнему допустимо по указанной выше причине
        System.out.println("x2.a: " + x2.a);

        // В классе Х известны только члены класса Х
        x2.a = 19;   // Допустимо
        // x2.b = 27;   // Ошибка, так как переменная b не
                        // является членом класса X
        X s = new Y(2, 3);
        System.out.println(s.a);
    }
}
