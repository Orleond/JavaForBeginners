package Appendixes.AppendixesF;
/**
 * Выведение типов в случае пользовательского класса
 */
public class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10);   // Обратите внимание на использование
                                       // ключевого слова var

        System.out.println("Значение i в объекте mc равно " + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в объекте mc равно " + mc.geti());
    }
}
