package Chapters.Chapter13;
/**
 * Обобщенные типы и массивы
 */
public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = { 1, 2, 3, 4, 5 };

        // Невозможно создать массив обобщенных ссылок
        // на объекты конкретного типа
//        Gen2<Integer>[] gens = new Gen2<Integer>[10]; // Ошибка!

        // Следующее выражение допустимо
        Gen<?>[] gens = new Gen<?>[10];
    }
}
