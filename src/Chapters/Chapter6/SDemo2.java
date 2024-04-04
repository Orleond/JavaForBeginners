package Chapters.Chapter6;
/*
 * Применение статического метода
 */
class StaticMeth {
    static int val = 1024;  // Статическая переменная

    // Статический метод
    static int valDiv2() {
        return val / 2;
    }
}
public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("Значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

    }
}
