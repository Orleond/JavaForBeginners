package Chapters.Chapter8;
/*
 * Усовершенствованная версия интерфейса Series, которая включает
 * используемый по умолчанию метод getNextArray()
 */
public interface Series2 {
    int getNext();         // Возврат следующего числа в ряду

    // Возврат массива, который содержит n элементов,
    // располагающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset();           // Сброс
    void setStart(int x);   // Установка начального значения
}
