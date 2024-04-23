package Chapters.Chapter14;
/**
 * Использование ссылки на метод экземпляра
 */
public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Создать ссылку ip на метод isFactor объекта myNum
        IntPredicate ip = myNum::isFactor;

        // Использовать ссылку для вызова метода isFactor()
        // через метод test()
        result = ip.test(3);
        if (result) System.out.println("3 является делителем " +
                myNum.getNum());

        // Создать ссылку на метод isFactor для объекта muNum2
        // и использовать ее для вызова метода isFactor()
        // через метод test()
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 не является делителем " +
                myNum2.getNum());
    }
}
