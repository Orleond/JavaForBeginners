package Homeworks.Homeworks14;
/**
 * В программе MethodRefDemo2 добавьте в класс
 * MyIntNum новый метод hasCommonFactor(). Этот
 * метод должен возвращать true, если его аргумент
 * типа int и значение, которое хранится в
 * вызывающем объекте MyIntNum, имеют по крайней
 * мере один общий делитель. Продемонстрируйте
 * работу метода hasCommonFactor(), используя ссылку
 * на метод.
 */
interface IntPredicate {
    boolean test(int n);
}
