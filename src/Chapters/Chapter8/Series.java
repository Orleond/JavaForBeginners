package Chapters.Chapter8;
/*
 * Усовершенствованная версия интерфейса Series, которая включает
 * используемый по умолчанию метод getNextArray().
 * Еще одна расширенная версия интерфейса Series, включающая
 * два заданных по умолчанию метода и использующая закрытый
 * метод getArray();
 */
public interface Series {
    int getNext();         // Возврат следующего по порядку числа

    // Возврат массива, который содержит n элементов,
    // располагающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    // Возврат массива, содержащего следующие n элементов,
    // в ряду, после пропуска элементов
    default int[] skipAndGetNextArray(int skip, int n) {
        // Пропуск указанного числа элементов
        getArray(skip);
        return getArray(n);
    }

    // Закрытый метод, возвращающий массив, который
    // содержит следующие n элементов
    private int[] getArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            getNext();
        }
        return vals;
    }
    void reset();           // Сброс
    void setStart(int x);   // Установка начального значения
}
