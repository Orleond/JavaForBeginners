package Chapters.Chapter6;
/*
 * Методам можно передавать объекты
 */
public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Возврат логического значения true, если
    // параметр ob определяет тот же параллелепипед
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        return false;
    }

    // Возврат логического значения true, если
    // параметр ob определяет параллелепипед того же объема
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) return true;
        return false;
    }
}
