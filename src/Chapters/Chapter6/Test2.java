package Chapters.Chapter6;

/**
 * Объекты передаются методам по ссылке
 */
public class Test2 {
    int a, b;
    Test2() { }
    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменные ob.a и ob.b
    // объекта, используемого при вызове, также будут изменяться
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
