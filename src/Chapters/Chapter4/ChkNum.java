package Chapters.Chapter4;
/**
 * Простой пример применения параметра в методе
 */
class ChkNum {
    // Возврат логического значения true,
    // если x содержит четное число
    boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }
}
