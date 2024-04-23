package Chapters.Chapter13;
/**
 * Пример простого обобщенного метода
 */
public class GenericMethodDemo {
    // Определить, совпадает ли содержимое двух массивов
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[]y) {
        // Массивы, имеющие разную длину, не могут быть одинаковыми
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) return false;   // Массивы отличаются
        }

        return true;    // Содержимое массивов совпадает
    }

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        Integer[] nums2 = { 1, 2, 3, 4, 5 };
        Integer[] nums3 = { 1, 2, 3, 4, 5 };
        Integer[] nums4 = { 1, 2, 3, 4, 5, 6 };

        if (arraysEqual(nums, nums))
            System.out.println("nums эквивалентен nums");

        if (arraysEqual(nums, nums2))
            System.out.println("nums эквивалентен nums2");

        if (arraysEqual(nums, nums3))
            System.out.println("nums эквивалентен nums3");

        if (arraysEqual(nums, nums4))
            System.out.println("nums эквивалентен nums4");

        // Создать массив типа Double
        Double[] dvals = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // Следующая строка не будет скомпилирована, так как
        // типы массивов nums и dvals не совпадают
        // if (arraysEqual(nums, dvals))
        //      System.out.println("nums эквивалентен dvals)'
    }
}
