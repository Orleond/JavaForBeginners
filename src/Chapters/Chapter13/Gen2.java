package Chapters.Chapter13;
/**
 * Обобщенные типы и массивы
 */
public class Gen2<T extends Number> {
    T ob;

    T[] vals;   // Допустимо

    Gen2(T o, T[] nums) {
        ob = o;

        // Следующее выражение недопустимо
//        vals = new T[10]; // Невозможно создать массив типа T

        // Однако такой оператор допустим
        vals = nums;    // Присвоение ссылки на существующий
                        // массив допускается
    }
}