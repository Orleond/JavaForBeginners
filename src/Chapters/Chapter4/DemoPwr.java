package Chapters.Chapter4;
/*
 * Возведение в степень заданного числа
 */
class Pwr {
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
public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.base + " в степени " + x.exp +
                " равно " + x.getPwr());
        System.out.println(y.base + " в степени " + y.exp +
                " равно " + y.getPwr());
        System.out.println(z.base + " в степени " + z.exp +
                " равно " + z.getPwr());
    }
}
