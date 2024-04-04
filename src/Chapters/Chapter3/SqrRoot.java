package Chapters.Chapter3;
/*
 * Вывод квадратных корней чисел от 1 до 99
 * вместе с ошибкой окрушления
 */
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num +
                    " равен " + sroot);

            // Вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
