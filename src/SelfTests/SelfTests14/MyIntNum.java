package SelfTests.SelfTests14;
/**
 * Добавление метода hasCommonFactor() в класс MyIntNum
 */
class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }

    int getNum() { return v; }

    // Вернуть true, если n является делителем м
    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n) {
        for (int i = 2; i < v / i; i++)
            if (((v % i) == 0) && ((n % i) == 0)) return true;

        return false;
    }
}
