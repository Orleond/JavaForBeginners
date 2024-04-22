package Chapters.Chapter7;
/**
 * Обращение к объекту подкласса по ссылочной
 * переменой суперкласса
 */

class Y extends X {
    int a;
    Y(int i, int j) {
        super(j);
        a = i;
    }
}
