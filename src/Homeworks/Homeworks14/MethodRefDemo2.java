package Homeworks.Homeworks14;
/*
 * В программе MethodRefDemo2 добавьте в класс
 * MyIntNum новый метод hasCommonFactor(). Этот
 * метод должен возвращать true, если его аргумент
 * типа int и значение, которое хранится в
 * вызывающем объекте MyIntNum, имеют по крайней
 * мере один общий делитель. Продемонстрируйте
 * работу метода hasCommonFactor(), используя ссылку
 * на метод.
 */
public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::hasCommonFactor;
        System.out.println(ip.test(13));
        ip = myNum2::hasCommonFactor;
        System.out.println(ip.test(32));
    }
}
