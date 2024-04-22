package Chapters.Chapter6;
/**
 * Использование массива аргументов переменной длины
 * наряду с обычными аргументами
 */
public class VarArgs2 {
    // Здесь msg = обычный параметр,
    // а v - массив параметров переменной длины
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумента в массиве: ", 10);
        vaTest("Три аргумента в массиве: ", 1, 2, 3);
        vaTest("Отсутствуют аргументы в массиве: ");
    }
}
