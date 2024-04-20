package Chapters.Chapter6;
/*
 * Сравнение модификаторов доступа public и private
 */
public class MyClass {
    private int alpha;  // Закрытый доступ
    public int beta;    // Открытый доступ
    int gamma;  // Тип доступа по умолчанию (по сути, public)

    // Методы доступа к переменной alpha. Члены класса могут
    // обращаться к закрытым членам того же класса.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
