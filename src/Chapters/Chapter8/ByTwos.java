package Chapters.Chapter8;
/*
 * Реализация интерфейса Series.
 * Реализация интерфейса Series и добавление метода getPrevious().
 * Использование интерфейсных ссылок
 */
public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() {
        return prev;
    }

}
