package Chapters.Chapter13;
/**
 * Использование шаблона аргумента
 */
public class NumericFns2<T extends Number> {
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFns2(T n) {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFns2<?> ob) {
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}
