package Chapters.Chapter14;
/**
 * Данный класс хранит значение типа int и определяет метод
 * isFactor(), который возвращает значение true, если его
 * аргумент является делителем числа, хранящегося в классе
 */
public class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }
    int getNum() { return v; }


    // Вернуть true, если n - делитель
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
