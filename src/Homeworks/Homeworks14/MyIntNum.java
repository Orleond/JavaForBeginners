package Homeworks.Homeworks14;

import java.util.ArrayList;
import java.util.List;

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
public class MyIntNum {
    private int v;

    boolean hasCommonFactor(int n) {
        List<Integer> del1 = new ArrayList<>();
        List<Integer> del2 = new ArrayList<>();
        for (int i = 2; i < v; i++) {
            if (v % i == 0)
                del1.add(i);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                del2.add(i);
        }
        for (int l1: del1)
            for (int l2: del2)
                if (l1 == l2)
                    return true;
        return false;

    }

    MyIntNum(int x) { v = x; }
    int getNum() { return v; }


    // Вернуть true, если n - делитель
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
