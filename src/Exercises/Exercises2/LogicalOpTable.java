package Exercises.Exercises2;
/*
 * Упражнение 2.2
 * Отображение таблицы истинности для логических операций
 */
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        System.out.println();

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        if (p) a = 1;
        if (q) b = 1;
        if (p & q) c = 1;
        if (p | q) d = 1;
        if (p ^ q) e = 1;
        if (!p) f = 1;
        System.out.print(a + "\t" + b + "\t");
        System.out.print(c + "\t" + d + "\t");
        System.out.println(e + "\t" + f);

        p = true; q = false;
        a = 0; b = 0; c = 0; d = 0; e = 0; f = 0;
        if (p) a = 1;
        if (q) b = 1;
        if (p & q) c = 1;
        if (p | q) d = 1;
        if (p ^ q) e = 1;
        if (!p) f = 1;
        System.out.print(a + "\t" + b + "\t");
        System.out.print(c + "\t" + d + "\t");
        System.out.println(e + "\t" + f);

        p = false; q = true;
        a = 0; b = 0; c = 0; d = 0; e = 0; f = 0;
        if (p) a = 1;
        if (q) b = 1;
        if (p & q) c = 1;
        if (p | q) d = 1;
        if (p ^ q) e = 1;
        if (!p) f = 1;
        System.out.print(a + "\t" + b + "\t");
        System.out.print(c + "\t" + d + "\t");
        System.out.println(e + "\t" + f);

        p = false; q = false;
        a = 0; b = 0; c = 0; d = 0; e = 0; f = 0;
        if (p) a = 1;
        if (q) b = 1;
        if (p & q) c = 1;
        if (p | q) d = 1;
        if (p ^ q) e = 1;
        if (!p) f = 1;
        System.out.print(a + "\t" + b + "\t");
        System.out.print(c + "\t" + d + "\t");
        System.out.println(e + "\t" + f);
    }
}
