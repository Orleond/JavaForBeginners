package Chapters.Chapter14;
/*
 * Функциональный интерфейс для числовых предикатов, которые
 * воздействуют на объект типа MyIntNum и целочисленное значение
 */
public interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}
