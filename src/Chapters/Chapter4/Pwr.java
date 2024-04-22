package Chapters.Chapter4;
/**
 * Возведение в степень заданного числа
 */
public class Pwr {
    double base;
    int exp;
    double val;

    Pwr(double base, int exp) {
        this.base = base;
        this.exp = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) this.val *= base;
    }

    double getPwr() { return this.val; }
}
